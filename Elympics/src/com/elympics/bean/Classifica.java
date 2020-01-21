package com.elympics.bean;

public class Classifica implements Comparable<Classifica>{
	
	
		User User;
		int punti;
		
		public User getUser() {
			return User;
		}
		public void setUser(User user) {
			this.User = user;
		}
		public int getPunti() {
			return punti;
		}
		public void setPunti(int punti) {
			this.punti = punti;
		}
		public Classifica(User user, int punti) {
			super();
			User = user;
			this.punti = punti;
		}
		public Classifica() {						
		}
		public int compareTo(Classifica o) {
			
			return o.getPunti()-this.getPunti();
		}

	}

