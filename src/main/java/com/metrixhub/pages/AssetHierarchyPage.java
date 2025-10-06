package com.metrixhub.pages;

import com.metrixhub.generic.CommonMethods;

public class AssetHierarchyPage extends CommonMethods {

	public AssetHierarchyPage () throws Exception {
		
		super();
	}
	
	public void assetHirarchyFunction() {
		
		clickWebElement("openAssetHiererchy");
	}
	
	public void hoverNode() {
		
		clickWebElement("node");
	}
	
	public void addAsset() {
		
		clickWebElement("addAsset");
	}
}
