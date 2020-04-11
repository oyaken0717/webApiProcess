package com.example.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//各アノテーションの読み込み
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Receive;
import com.example.domain.Send;

//■	https://fresopiya.com/2019/09/16/webapijson/
//■ 「Jackson」が呼ばれる > オブジェクトとJSONの相互変換を行うライブラリ > 戻り値をJSON形式に変換
@RestController
public class humanJudgeController {

	@RequestMapping(value = "/judge", method = { RequestMethod.POST })
	public Receive judgeHuman(@RequestBody Send send) {
	// ■ @RequestBody:リクエストを取得し、指定された型に値を注入
	//	public List<CreatureDTO> judgeHuman(@RequestBody List<CreatureDTO> creature) {
		Receive receive = new Receive();
		if ("human".equals(send.getType())) {
			receive.setName("合ってる。");
			receive.setType("タイプ");
		} else {
			receive.setName("違うのが入ってます。");
			receive.setType("タイプ");
		}
		return receive;
	}
}