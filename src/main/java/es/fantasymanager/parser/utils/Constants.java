package es.fantasymanager.parser.utils;

import org.openqa.selenium.By;

public interface Constants {

	public static final String URL_ESPN = "http://www.espn.com";
	public static final String URL_ROTOWORLD_NEWS = "https://www.rotoworld.com/basketball/nba/player-news";
	
	/********************************
	 ************ NEWS **************
	 *******************************/
	public static final By BY_ROTOWORLD_NEWS_LIST = By
			.cssSelector("ul.player-news__list.active.player-news__dynamic-list li article.player-news-article");
	public static final By BY_ROTOWORLD_NEWS_ARTICLE_DATE = By.cssSelector("div.player-news-article__timestamp");
	public static final By BY_ROTOWORLD_NEWS_ARTICLE_HEADER = By
			.cssSelector("div.player-news-article__header a:nth-of-type(2)");
	public static final By BY_ROTOWORLD_NEWS_ARTICLE_TITLE = By.cssSelector("div.player-news-article__title");
	public static final By BY_ROTOWORLD_NEWS_ARTICLE_SUMMARY = By.cssSelector("div.player-news-article__summary");
}
