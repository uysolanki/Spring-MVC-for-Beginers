package com.excelr.model;

public class Player {
		private int jno;
		private String pname;
		private int mp;
		private int rs;
		
		public Player() {}
		public Player(int jno, String pname, int mp, int rs) {
			this.jno = jno;
			this.pname = pname;
			this.mp = mp;
			this.rs = rs;
		}
		public int getJno() {
			return jno;
		}
		public void setJno(int jno) {
			this.jno = jno;
		}
		public String getPname() {
			return pname;
		}
		public void setPname(String pname) {
			this.pname = pname;
		}
		public int getMp() {
			return mp;
		}
		public void setMp(int mp) {
			this.mp = mp;
		}
		public int getRs() {
			return rs;
		}
		public void setRs(int rs) {
			this.rs = rs;
		}
		@Override
		public String toString() {
			return "Player [jno=" + jno + ", pname=" + pname + ", mp=" + mp + ", rs=" + rs + "]";
		}
		
		
}
