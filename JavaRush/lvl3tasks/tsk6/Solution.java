package JavaRush.lvl3tasks.tsk6;

public class Solution {
    private String fullName;
    public void setName(String firstname, String lastname){
        String fullName = firstname + lastname;
        this.fullName = fullName;
    }
    public void getPrivateFullName(){
        System.out.print(fullName);
    }
}
