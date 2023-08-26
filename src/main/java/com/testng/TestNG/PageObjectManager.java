package com.testng.TestNG;

public class PageObjectManager {
	static PageObjectManager pom;
	LoginPage lp;
	
	PimPage pim;
	LeavePage le;
	
	public static PageObjectManager getPom() {
		if (pom == null) {
			pom = new PageObjectManager();
		}
		return pom;
	}
	public LoginPage getLp() {
		if (lp == null) {
			lp = new LoginPage();
		}
		return lp;
	}
	public PimPage getPim() {
		if (pim == null) {
			pim = new PimPage();
		}
		return pim;
	}
	public LeavePage getLe() {
		if (le == null) {
			le = new LeavePage();
		}
		return le;
	}
}


