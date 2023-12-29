package com.nanumsol.www.domain;

public class PageHandler {
	private int totalCnt; //총 게시물 갯수 (DB에 저장된 행의 수)
	private int pageSize = 10; //한 페이지의 크기 (한 페이지에 게시글을 몇 개 보여줄거니?)
	private int naviSize = 5; // 페이지 내비게이션의 크기 (1page~10page까지 보여주겠다)
	private int totalPage; // 전체 페이지의 갯수 
	private int page; // 현재 페이지
	private int beginPage; // 내비게이션의 첫번째 페이지
	private int endPage; // 내비게이션의 마지막 페이지 (만약, 1~10page를 보여준다면, endpage=10)
	private boolean showPrev; // 이전 페이지로 이동하는 링크를 보여줄 것인지의 여부 
	private boolean showNext; // 다음 페이지로 이동하는 링크를 보여줄 것인지의 여부 

	//총 게시물 갯수, 현재 페이지만 입력했을 경우, 
	public PageHandler(int totalCnt, int page) {
		//매개변수를 3개 입력하는 타 생성자를 호출해라 (한 페이지의 크기를 10으로 default값을 줘서) 
		this(totalCnt, page, 10);
	}
	
	//총 게시물 갯수 , 현재 페이지 , 한 페이지의 크기를 매개변수로 받았을 경우 실행
	public PageHandler(int totalCnt, int page, int pageSize) {
		this.totalCnt = totalCnt;
		this.page = page;
		this.pageSize = pageSize;
		
		//전체 페이지의 갯수 구하는 공식  
		//Math.ceil = 소수 첫째자리 올림 (Math.ceil을 사용하면 반환값이 double이 되기 때문에, int로 형변환)
		//소수 첫 자리를 구해야 하기 때문에, totalCnt/pageSize는 double데이터 타입이 나와야 해서 
		//pageSize를 double로 형변환 
		totalPage = (int)Math.ceil(totalCnt / (double) pageSize);
		
		//네비게이션의 첫번째 페이지 구하는 공식
		//현재 페이지(ex_14) / 내비게이션의 첫 번째 페이지 (10) = 1
		//(1 X 10) + 1= 11 (즉, 14페이지의 첫 페이지는 11) 
		beginPage = (page / naviSize) * naviSize + 1; 
		
		//네비게이션의 마지막 페이지 구하는 공식
		//시작 페이지와 totalPage 중에서 작은 쪽을 endPage로 지정  
		//Math.min 말고 3항 연산자를 사용해도 된다
		endPage = Math.min(beginPage + naviSize - 1, totalPage);
		
		//이전 화면 이동버튼은 beginPage값이 1이 아니면 출력하고 (반환값은 true 혹은 false)
		showPrev = beginPage != 1; 
		
		//다음 페이지 버튼은 endPage가 totalPage가 아니면 출력해라
		showNext = endPage != totalPage;
				
	}
	
	//페이지 네비게이션을 출력하는 메서드
	public void print() {
		//현재 페이지 출력
		System.out.println("page = " + page);
		
		//이전 페이지 버튼이 참이면 버튼을 보여주고, false면 공백을 출력
		System.out.print(showPrev ? "[PREV]" : "");
		
		//첫 번째 페이지에에서부터 네비게이션 마지막 페이지까지 1++ 반복해서 출력
		//ex_ 1 2 3 4 5 6 7 8 9 10 
		for(int i = beginPage; i <= endPage; i++) {
			System.out.print(i + " ");
		}
		
		//다음 페이지가 true라면 버튼 출력
		System.out.println(showNext ? "[NEXT]" : "");
	}
	
	public int getTotalCnt() {
		return totalCnt;
	}

	public void setTotalCnt(int totalCnt) {
		this.totalCnt = totalCnt;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getNaviSize() {
		return naviSize;
	}

	public void setNaviSize(int naviSize) {
		this.naviSize = naviSize;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getBeginPage() {
		return beginPage;
	}

	public void setBeginPage(int beginPage) {
		this.beginPage = beginPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public boolean isShowPrev() {
		return showPrev;
	}

	public void setShowPrev(boolean showPrev) {
		this.showPrev = showPrev;
	}

	public boolean isShowNext() {
		return showNext;
	}

	public void setShowNext(boolean showNext) {
		this.showNext = showNext;
	}


	@Override
	public String toString() {
		return "PageHandler [totalCnt=" + totalCnt + ", pageSize=" + pageSize + ", naviSize=" + naviSize
				+ ", totalPage=" + totalPage + ", page=" + page + ", beginPage=" + beginPage + ", endPage=" + endPage
				+ ", showPrev=" + showPrev + ", showNext=" + showNext + "]";
	}
	
	
}

