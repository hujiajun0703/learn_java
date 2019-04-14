package leetcode.easy;
/**
 *  转换成小写字母
 */
public class Question709 {
	public String toLowerCase(String str) {
		char[] s = new char[str.length()];
		for(int i = 0;i<str.length();i++){
			char cstr = str.charAt(i);
			if(cstr>='A'&&cstr<='Z'){
				cstr = (char) (cstr + 32);
			}
			s[i] = cstr;
		}
		return new String(s);
	}
}
