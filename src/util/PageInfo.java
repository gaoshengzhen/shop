package util;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

public class PageInfo {
	private int p;//��ǰҳ��
	private int pagesize=5;//ÿҳҳ��
	private int countn=0;//�ܼ�¼��
	private List<Object> list = new ArrayList<Object>();//��ʾ�ļ�¼
    String url = null;//���ʵ�url
	public int getPagesize() {
		return pagesize;
	}
	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}
	public int getP() {
		return p;
	}
	public void setP(int p) {
		this.p = p;
	}
	public int getCountn() {
		return countn;
	}
	public void setCountn(int countn) {
		this.countn = countn;
	}
	public List<Object> getList() {
		return list;
	}
	public void setList(List<Object> list) {
		this.list = list;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
    //�õ���ҳ��
	public int countpage() {
		return this.countn%this.pagesize==0?this.countn/this.pagesize:this.countn/this.pagesize+1;
	}
	
	
	public PageInfo(HttpServletRequest request) {
		//�ı䵱ǰҳ����
		if(request.getParameter("p")!=null) {
			this.p=Integer.valueOf(request.getParameter("p"));
		}else {
			this.p=1;
		}
		this.url = request.getRequestURL().toString();
		System.out.println(url);
		request.getSession().setAttribute("pageInfo", this);
	}
	
	
	
}
