package com.dcms.cms.action.wechat;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dcms.cms.web.FrontUtils;

/**
 * 微信认证接口
 * @author Daily
 *
 */
@Controller
public class WeChatAuthenticationAct {
	@RequestMapping(value = "/auth.jspx", method = RequestMethod.GET)
	public static String authWeChat(String signature,  String timestamp, String nonce, String echostr, HttpServletRequest request){
//		CmsSite site = CmsUtils.getSite(request);
		String[] str = new String[3];
		str[0] = "dailyCms123456abcd9433441";
		str[1] = timestamp;
		str[2] = nonce;
		Arrays.sort(str);
		StringBuilder builder = new StringBuilder();
		for(String s : str){
			builder.append(s);
			System.out.println(s);
		}
		
		
		//SHA加密
		MessageDigest md = null;
		String sha1 = "";
		
		try {
			md = MessageDigest.getInstance("SHA-1");
			byte[] digest = md.digest(builder.toString().getBytes());
			
			sha1 = new String(digest);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("sha1:"+sha1);
		System.out.println("signature:"+signature);
		
		
		return null;
		/*return FrontUtils.getTplPath(site.getSolutionPath(),
				TPLDIR_WECHAT, "auth");*/
	}
	
	public static void main(String[] args) {
		authWeChat("aaa", "20141011", "accc", "3333", null);
	}
}
