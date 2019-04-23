package com.osf.web.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.osf.web.dao.AddrDAO;

@Repository //얘가 DAO 
public class AddrDAOImpl implements AddrDAO {

//	@Autowired
//	private DataSource ds;
	
	@Autowired
	private SqlSessionFactory ssf;
	
	@Override
	public List<Map<String, String>> selectAddrList() {
		
		SqlSession ss = ssf.openSession();
		
		Map<String,String> param = new HashMap<String,String>();
		param.put("adNum","20");
		param.put("adSido", "부산광역시");
		//사용자한테 받았다고 가정.
		return ss.selectList("addr.selectAddrList",param);
//		Connection con;
//		List<Map<String,String>> addrList = new ArrayList<Map<String,String>>();
//		try {
//			con = ds.getConnection();
//			PreparedStatement ps = con.prepareStatement("select * from address where ad_num<=50");
//			ResultSet rs = ps.executeQuery();
//			while(rs.next()) {
//				Map<String,String> addrMap = new HashMap<String,String>(); 
//				addrMap.put("ad_num", rs.getString("ad_num"));
//				addrMap.put("ad_code", rs.getString("ad_code"));
//				addrMap.put("ad_sido", rs.getString("ad_sido"));
//				addrMap.put("ad_gugun", rs.getString("ad_gugun"));
//				addrMap.put("ad_dong", rs.getString("ad_dong"));
//				addrMap.put("ad_lee", rs.getString("ad_lee"));
//				addrMap.put("ad_bunji", rs.getString("ad_bunji"));
//				addrMap.put("ad_ho", rs.getString("ad_ho"));
//				addrMap.put("ad_roadcode", rs.getString("ad_roadcode"));
//				addrMap.put("ad_isbase", rs.getString("ad_isbase"));
//				addrMap.put("ad_orgnum", rs.getString("ad_orgnum"));
//				addrMap.put("ad_subnum", rs.getString("ad_subnum"));
//				addrMap.put("ad_jinum", rs.getString("ad_jinum"));
//				addrList.add(addrMap);
//			}
//			return addrList;
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		
//		return null;
	}

	
}
