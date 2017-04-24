/******************************************************************
 *
 *    Package:     com.blemobi.library.client
 *
 *    Filename:    PlatformHttpClient.java
 *
 *    Description: TODO
 *
 *    @author:     HUNTER.POON
 *
 *    @version:    1.0.0
 *
 *    Create at:   2017年4月24日 上午11:10:49
 *
 *    Revision:
 *
 *    2017年4月24日 上午11:10:49
 *        - first revision
 *
 *****************************************************************/
package com.blemobi.library.client;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;

import com.blemobi.library.util.HttpUtils;

/**
 * @ClassName PlatformHttpClient
 * @Description TODO
 * @author HUNTER.POON
 * @Date 2017年4月24日 上午11:10:49
 * @version 1.0.0
 */
public class PlatformHttpClient extends BaseHttpClient {
	public PlatformHttpClient() {
		super("platform");
	}
	
	public Boolean tipoffPost(String uuid, String token, String postId, String content) throws IOException{
		basePath = new StringBuffer("/platform-manager/report/news");
		this.getServerURL();
		List<Cookie> list = new ArrayList<Cookie>();
		Cookie c1 = new Cookie("uuid", uuid);
		Cookie c2 = new Cookie("token", token);
		list.add(c1);
		list.add(c2);
		Map<String, String> param = new HashMap<String, String>();
		HttpUtils.getInstance().post(url.toString(), param, list);
		return true;
	}
}
