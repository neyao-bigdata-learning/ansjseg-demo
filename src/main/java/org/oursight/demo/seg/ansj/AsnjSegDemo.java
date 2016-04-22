package org.oursight.demo.seg.ansj;

import org.ansj.domain.Term;
import org.ansj.splitWord.analysis.BaseAnalysis;
import org.ansj.splitWord.analysis.NlpAnalysis;
import org.ansj.splitWord.analysis.ToAnalysis;

import java.util.List;

/**
 * Created by neyao@github.com on 2016/4/22.
 */
public class AsnjSegDemo {

    public static void main(String[] args) {
        // 基本分词
        List<Term> parse1 = BaseAnalysis.parse("让战士们过一个欢乐祥和的新春佳节。");
        System.out.println("基本分词：\r\n" + parse1);

        // 精准分词
        List<Term> parse2 = ToAnalysis.parse("让战士们过一个欢乐祥和的新春佳节。");
        System.out.println("精准分词：\r\n" + parse2);

        // NLP分词
        List<Term> parse3 = NlpAnalysis.parse("洁面仪配合洁面深层清洁毛孔 清洁鼻孔面膜碎觉使劲挤才能出一点皱纹 脸颊毛孔修复的看不见啦 草莓鼻历史遗留问题没辙 脸和脖子差不多颜色的皮肤才是健康的 长期使用安全健康的比同龄人显小五到十岁 28岁的妹子看看你们的鱼尾纹");
        System.out.println("NLP分词：\r\n" + parse3);

    }
}
