package com.metrixhub.tests;

import org.testng.annotations.Test;

import com.metrixhub.pages.AssetHierarchyPage;

public class AssetHierarchyTest extends BaseTest {
	
	public AssetHierarchyTest() throws Exception{
		
		super();
	}
	
	@Test
	public void assetTest() throws Exception{
		
		AssetHierarchyPage asp = new AssetHierarchyPage();
		
		asp.assetHirarchyFunction();
		Thread.sleep(1500);
		
		asp.hoverNode();
		Thread.sleep(1500);
		
		asp.addAsset();
		Thread.sleep(1500);
	}
}
