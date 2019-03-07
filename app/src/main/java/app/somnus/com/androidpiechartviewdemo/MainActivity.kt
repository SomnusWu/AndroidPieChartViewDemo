package app.somnus.com.androidpiechartviewdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class MainActivity : AppCompatActivity() {


    lateinit var pieChartView: PieChartView
    val COUNT: Int = 1


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pieChartView = f(R.id.pieChart)

        pieChartView.setInnerRadius(0.6f)
        pieChartView.setCenterTitleText("数据统计")
//        pieChartView.setPieCell(10);
//        pieChartView.setBackGroundColor(UIUtils.getResColor(mActivity, R.color.colorPaleGreen))
//        pieChartView.setItemTextSize(20);
//        pieChartView.setTextPadding(10);

        //饼图中心数据
        pieChartView.setCenterValueText("12345")


        pieChartView.addItemType(PieChartView.ItemType("苹果", 25, -0xdf4d56))
        pieChartView.addItemType(PieChartView.ItemType("华为", 17, -0x97dd75))
        pieChartView.addItemType(PieChartView.ItemType("小米", 13, -0x74a600))
        pieChartView.addItemType(PieChartView.ItemType("三星", 8, -0x32c900))
        pieChartView.addItemType(PieChartView.ItemType("OPPO", 6, -0x769733))
        pieChartView.addItemType(PieChartView.ItemType("VIVO", 5, -0xbc8ebb))
        pieChartView.addItemType(PieChartView.ItemType("魅族", 4, -0x724933))
        pieChartView.addItemType(PieChartView.ItemType("联想", 2, -0x9471dd))
        pieChartView.addItemType(PieChartView.ItemType("其他品牌", 20, -0x666667))

//        for (i in rows.indices) {
//            val result = rows.get(i)
//            val colorValue = if (i > 10) colors[5] else colors[i]
//            result.setBgColor(colorValue)
//            pieChartView.addItemType(PieChartView.ItemType(result.getType(), result.getNumber(), colorValue))
//        }
    }

    fun <T : View> f(id: Int): T {
        return findViewById<View>(id) as T
    }
}
