package edu.bit.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import edu.bit.board.vo.BoardVO;


// 데이터계층, 영속계층! 뒤의 인자는 있어도 없어도 상관없음 
//<bean id = "boardDAO"> 객체 생성하는것과 같다..
@Repository("boardDAO") 
public class BoardDAO {
	DataSource dataSource;
	
	public BoardDAO() {
		try {
			Context context = new InitialContext(); // 커넥션 풀을 설정한 context.xml에서 가져옴
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/oracle"); 
			//context 객체는 server안의 context.xml을 불러오는것
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<BoardVO> getBoardList(){
		List<BoardVO> dtos = new ArrayList<BoardVO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		
		try {			
			conn = dataSource.getConnection();
			String query = "select bId, bName, bTitle, bContent, bDate, bHit, bGroup, bStep, bIndent from mvc_board order by bGroup desc, bStep asc";
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {

				int bId = rs.getInt("bId");
				String bName = rs.getString("bName");
				String bTitle = rs.getString("bTitle");
				String bContent = rs.getString("bContent");
				Timestamp bDate = rs.getTimestamp("bDate");
				int bHit = rs.getInt("bHit");
				int bGroup = rs.getInt("bGroup");
				int bStep = rs.getInt("bStep");
				int bIndent = rs.getInt("bIndent");
				
				BoardVO dto = new BoardVO(bId, bName, bTitle, bContent, bDate, bHit, bGroup, bStep, bIndent);
				dtos.add(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
			
				e2.printStackTrace();
			}
		}
		return dtos;
		
	}
	
	
	public int write(String bName, String bTitle, String bContent) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int rn = 0;
		
		try {
			con = dataSource.getConnection();
			String query = "insert into mvc_board (bId, bName, bTitle, bContent, bHit, bGroup, bStep, bIndent) "
					+ "values (mvc_board_seq.nextval, ?, ?, ?, 0, mvc_board_seq.currval, 0, 0 )";
			pstmt = con.prepareStatement(query);

			pstmt.setString(1, bName);
			pstmt.setString(2, bTitle);
			pstmt.setString(3, bContent);
			rn = pstmt.executeUpdate();

			if (rn == 1) {
				System.out.println("정상");
			} else {
				System.out.println("비정상 처리");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	
		return rn;
		
	}

	
	
	public BoardVO contentView(String bId) {
//		upHit(bId);
		
		BoardVO vo = null;
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = dataSource.getConnection();
			String query = "select * from mvc_board where bId = ?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1,  Integer.parseInt(bId));
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int bNum = rs.getInt("bId");
				String bName = rs.getString("bName");
				String bTitle = rs.getString("bContent");
				String bContent = rs.getString("bContent");
				Timestamp bDate = rs.getTimestamp("bDate");
				int bHit = rs.getInt("bHit");
				int bGroup = rs.getInt("bGroup");
				int bStep = rs.getInt("bStep");
				int bIndent = rs.getInt("bIndent");
				
				vo = new BoardVO(bNum, bName, bTitle, bContent, bDate, bHit, bGroup, bStep, bIndent);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)
					rs.close();
				if(pstmt!= null)
					pstmt.close();
				if(con != null)
					con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}
		return vo;
	}
}
