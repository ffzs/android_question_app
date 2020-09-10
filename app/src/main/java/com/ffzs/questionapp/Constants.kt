package com.ffzs.questionapp

import kotlin.collections.ArrayList

/**
 * @author: ffzs
 * @Date: 2020/9/10 上午10:31
 */

object Constants {

    const val QUESTION_COUNT = "question_count"
    const val CORRECT_COUNT = "correct_count"
    const val WRONG_COUNT = "wrong_count"


    fun getQuestions(count: Int): MutableList<Question> {
        val questions = ArrayList<Question>()
        val que1 = Question(1, "咬定青山不放松，立根原在破岩中。\n _________，任尔东西南北风",
            1, "不知细叶谁裁出", "春潮带雨晚来急", "粉骨碎身浑不怕", "千磨万击还坚劲", 4)
        val que2 = Question(2, "关于神话的产生，一向比较通行的解释是宗教说和(      )", 2,
            "游戏说", "宣泄说", "模仿说", "劳动说", 4)
        val que3 = Question(3, "《诗经·静女》是(      )", 3,
            "情爱诗", "战争诗", "农事诗", "怨刺诗", 1)
        val que4 = Question(4, "汉代经师伏生所传，用当时通行的隶书写定的《尚书》是(      )",
            4, "今文《尚书》", "古文《尚书》", "伪古文《尚书》", "《逸周书》", 1)
        val que5 = Question(5, "《荀子》散文属于(      )",
            5, "寓言体", "叙事体", "语录体", "论述体", 4)
        val que6 = Question(6, "下列关于水的文句出自《老子》的是(      )",
            6, "上善若水。水善利万物而不争", "秋水时至，百川灌河", "冰，水为之而寒于水", "洪水横流，泛滥于天下", 1)
        val que7 = Question(7, "《墨子》的文风特点是(      )",
            7, "语录体裁，辞约义丰", "篇幅简短，韵散结合", "质朴无华，逻辑性强", "义正词严，理直气壮", 3)
        val que8 = Question(8, "下列寓言出自《庄子》的是(      )",
            8, "舐痔结驷", "自相矛盾", "五十步笑百步", "狡兔三窟", 1)
        val que9 = Question(9,"下列关于旗帜的诗句中，属于宋玉所作的是(      )",
            9,"凤皇翼其承旂兮，高翱翔之翼翼","驾八龙之婉婉兮，载云旗之委蛇","载云旗之委蛇兮，扈屯骑之容容","乘赤豹兮从文狸，辛夷车兮结桂旗",3)
        val que10 = Question(10, "除分析秦亡的原因外，贾山《至言》着重讨论的另一问题是(      )",
            10, "经济发展问题", "礼仪制度问题", "君臣关系问题", "统一思想问题", 3)
        val que11 = Question(11, "王充在文章写作上的重要主张是(      )",
            11, "反对通俗浅白，提倡典重艰深", "反对文辞华美，提倡质实无华", "反对以情为文，提倡冷峻沉着", "反对虚妄不实，提倡真诚实用", 4)
        val que12 = Question(12, "《史记》的核心部分、文学成就最高的是(      )",
            12, "本纪、表、书", "本纪、表、世家", "本纪、书、列传", "本纪、世家、列传", 4)
        val que13 = Question(13,"以下有关《吴越春秋》的说法中，正确的一项是(      )",
            13,"《吴越春秋》的作者是东汉人袁康","《吴越春秋》的结构是各篇相对独立","《吴越春秋》除记叙吴越争霸，还有记载地理、占气等专篇","《吴越春秋》前五卷记叙吴国历史，后五卷记叙越国历史",4)
        val que14 = Question(14, "下列辞赋中表达怀人主题的是(      )",
            14, "《自悼赋》", "《李夫人赋》", "《哀秦二世赋》", "《非有先生论》", 2)
        val que15 = Question(15, "被后人誉为汉大赋之绝响的作品是(      )",
            15, "司马相如《长门赋》", "扬雄《甘泉赋》", "班固《两都赋》", "张衡《二京赋》", 4)

        questions.addAll(
            listOf(que1, que2, que3, que4, que5, que6, que7, que8, que9, que10, que11, que12, que13, que14, que15)
        )

        questions.shuffle()
        return questions.subList(0, count)
    }
}