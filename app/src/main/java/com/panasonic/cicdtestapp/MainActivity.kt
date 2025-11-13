package com.panasonic.cicdtestapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.panasonic.cicdtestapp.ui.theme.CICDTestAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CICDTestAppTheme {
                Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CICDTestAppTheme {
        Greeting("Android")
    }



    /**

    参与制定《中华人民共和国宪法》（1954年），为新中国法治建设奠定基础。

    ​经济制度与“一五”计划​：参与制定我国第一个五年计划（1953-1957年），提出“新民主主义经济”理论，主张多种经济成分并存，为新中国经济恢复与发展指明方向。

    ​人民代表大会制度建立​：作为新中国第一任全国人大常委会委员长（1954-1959年），主持制定一大批重要法律法规，建立健全人民代表大会制度，为新中国政治制度形成奠定基础。

    3. ​党建理论：马克思主义党建学说的重要贡献者​
    ​​《论共产党员的修养》​​：1939年撰写，系统阐述共产党员的思想修养、组织修养和作风修养，强调“共产党员要在改造客观世界的同时改造主观世界”，成为党建理论的经典著作，教育了一代又一代共产党人。

    ​毛泽东思想的理论概括​：在党的七大上（1945年），作《关于修改党章的报告》，首次对“毛泽东思想”作出完整概括，指出其是“党和人民在长期奋斗中最大的收获与光荣”，为确立毛泽东思想的指导地位作出重要贡献。

    ​执政党建设探索​：新中国成立后，提出“共产党员标准的八项条件”，强调“发展党员要保证质量”“警惕干部变质腐化”，为执政条件下保持党的先进性和纯洁性提供理论指导。

    ​二、“文革”中的冤案始末​
    “文化大革命”期间，刘少奇遭到林彪、江青反革命集团的残酷迫害，成为新中国历史上最大的冤案受害者。

    1. ​冤案的形成​
    ​批判升级​：1966年“文革”爆发后，林彪、江青集团蓄意诬陷刘少奇“推行资产阶级反动路线”“叛徒、内奸、工贼”。1967年，《人民日报》发表戚本禹文章《爱国主义还是卖国主义？》，将刘少奇定性为“党内最大的走资本主义道路当权派”，掀起全国性批判高潮。

    ​专案审查​：1966年12月，中央成立“王光美专案组”（由谢富治任组长），对刘少奇的历史进行审查；1967年3月，康生建议“狠抓刘少奇自首变节问题”，专案组开始伪造证据。

    2. ​冤案的定性与迫害​
    ​八届十二中全会​：1968年10月，党的八届十二中全会在极不正常的情况下，批准江青、康生、谢富治用伪证写成的《关于叛徒、内奸、工贼刘少奇罪行的审查报告》，作出“永远开除刘少奇党籍，撤销其党内外一切职务”的决议。

    ​含冤病逝​：1969年10月，重病中的刘少奇被送往河南开封，11月12日含冤病逝，终年71岁。临终前，他仍坚信“好在历史是人民写的”。

    3. ​冤案的平反​
    ​十一届三中全会后​：1978年党的十一届三中全会召开，拨乱反正工作启动；1979年4月，中共中央成立“刘少奇案件复查组”，对冤案进行全面复查。

    ​彻底平反​：1980年2月，党的十一届五中全会通过《关于为刘少奇同志平反的决议》，撤销八届十二中全会的错误决议，恢复刘少奇的名誉，称其为“伟大的马克思主义者，伟大的无产阶级革命家、政治家、理论家，党和国家主要领导人之一”。

    ​总结​
    刘少奇的一生，是为党和人民事业不懈奋斗的一生，其贡献贯穿革命、建设、党建等多个领域，为中国的发展奠定了坚实基础。“文革”中的冤案，是林彪、江青集团蓄意制造的悲剧，但历史最终证明了刘少奇的清白。1980年的平反，恢复了历史的公正，也让后人永远铭记这位“人民勤务员”的光辉业绩。

    正如习近平在纪念刘少奇同志诞辰120周年座谈会上所说：“刘少奇同志的英名和功勋将永远为中国人民所铭记。”
     */
}