package com.jeeplus.weixin.api.wxsendmsg.model;

import java.util.ArrayList;
import java.util.List;
/**
 * 上传图文消息素材
 * @author LIAIJUN
 *
 */
public class WxArticlesRequest {
	List<WxArticle> articles = new ArrayList<WxArticle>();

	public List<WxArticle> getArticles() {
		return articles;
	}

	public void setArticles(List<WxArticle> articles) {
		this.articles = articles;
	}

	@Override
	public String toString() {
		return "WxArticlesRequest [articles=" + articles + "]";
	}

}
