package Shoetudio.spring.mvc.vo;

public class Reply {

    protected int rno;
    protected String reply;
    protected String userid;
    protected String regdate;
    protected String cmno;
    protected String rpno;

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getRegdate() {
        return regdate;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }

    public String getCmno() {
        return cmno;
    }

    public void setCmno(String cmno) {
        this.cmno = cmno;
    }

    public String getRpno() {
        return rpno;
    }

    public void setRpno(String rpno) {
        this.rpno = rpno;
    }
}
