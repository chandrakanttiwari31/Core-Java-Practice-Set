package collectioncoderjavasquad;

public class Employee1  implements Comparable{

	
		private int id;
		private String name ;
		private int sal;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getSal() {
			return sal;
		}
		public void setSal(int sal) {
			this.sal = sal;
		}
		@Override
		public String toString() {
			return "Employee1 [id=" + id + ", name=" + name + ", sal=" + sal + "]";
		}
		@Override
		public int compareTo(Object arg0) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		
		
	
}
