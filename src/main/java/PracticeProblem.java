public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String pyramid(int x) {
		String p="";
		for (int y=0; x>y; y++) {
			for (int z=1; x-y>z; z++) {
				p += " ";
			}
			for (int a=-1; y>a; a++) {
				p=p+("*");
				if (y>a+1&&p.endsWith("*")) {
					p+=" ";
				}
			}
			if (x>y+1) {
				p=p+("\n");
			}
		}
		return p;
	}

	public static String square(int x) {
		String s="";
		for (int y=0;x>y; y++) {
			if (y==0) {
				for (int a=0; x>a; a++) {
					s=s+("*");
				}
			}
			else if (y+1==x) {
				for (int a=0; x>a; a++) {
					s=s+("*");
				}
			}
			else {
				s=s+("*");
				for (int a=0; x-2>a; a++) {
					s += " ";
				}
				s=s+("*");
			}
			if (x-1>y) {
				s=s+("\n");
			}
		
		}
	return s;
	}

	public static boolean hasLowercase(String x) {
		boolean a=false;
		for (int y=0;x.length()>y; y++) {
			char z=x.charAt(y);
			if (Character.isLowerCase(z)) {
				a=true;
			}
		}
		if (a==true) {
			return true;
		}
		else {
			return false;
		}
	}

}
