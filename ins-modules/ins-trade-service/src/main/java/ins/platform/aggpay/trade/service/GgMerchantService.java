/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package ins.platform.aggpay.trade.service;


import ins.platform.aggpay.trade.entity.GgMerchant;
import ins.platform.aggpay.trade.vo.MerchantResVo;
import ins.platform.aggpay.trade.vo.GgMerchantVo;
import ins.platform.aggpay.trade.vo.RegistResVo;
import ins.platform.aggpay.trade.vo.RegisterQueryVo;
import ins.platform.aggpay.trade.vo.UploadPhotoVo;

import com.baomidou.mybatisplus.service.IService;
import com.mybank.bkmerchant.merchant.Register;
import com.mybank.bkmerchant.merchant.UpdateMerchant;
import com.mybank.bkmerchant.merchant.UploadPhoto;
import com.mybank.bkmerchant.trade.SendSmsCode;



/**
 * @author RipinYan
 * @ClassName: GgMerchantService
 * @Description: 商户入驻相关接口
 * @date 2018/9/18 下午4:11
 */
public interface GgMerchantService extends IService<GgMerchant> {

	//短信验证码发送接口
	MerchantResVo sendsmscode(SendSmsCode sendSmsCode);
	
	//图片上传接口
	UploadPhotoVo uploadphoto(UploadPhoto uploadPhoto);

	//商户入驻申请接口
	RegistResVo regist(GgMerchantVo register);
	
	//商户入驻结果查询
	RegisterQueryVo registerQuery(String orderNo);

	//商户信息修改
	MerchantResVo updateMerchant(UpdateMerchant updateMerchant);

	//商户信息查询接口
	GgMerchantVo merchantQuery(String isvOrgId, String orderNo);

	//商户关闭接口
	MerchantResVo merchantFreeze(String isvOrgId, String merchantId,
			String freezeReason, String outTradeNo);

	//商户开启接口
	MerchantResVo merchantUnfreeze(String isvOrgId, String merchantId,
			String unfreezeReason, String outTradeNo);
	
	

}