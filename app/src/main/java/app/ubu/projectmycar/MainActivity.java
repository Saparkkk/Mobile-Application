package app.ubu.projectmycar;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import app.ubu.projectmycar.model.Car;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        List<Car> cars = new ArrayList<Car>();
        Car car = new Car();
        car.setCar_name("BMW");
        car.setCar_image("https://i.pinimg.com/736x/9e/c5/7b/9ec57b5e46a72565b6814e6c21527e91.jpg");
        car.setCar_price("10000000");
        car.setCar_model("BMW I8");
        car.setCar_year("2014-2020");
        car.setCar_description(" BMW i8 เป็นรถสปอร์ตไฮบริดที่ใช้เทคโนโลยีล้ำสมัย มีการออกแบบที่ล้ำยุคและประหยัดพลังงาน มีเครื่องยนต์เบนซินเทอร์โบ 3 สูบ ขนาด 1.5 ลิตร พร้อมมอเตอร์ไฟฟ้าที่ช่วยเพิ่มประสิทธิภาพการขับขี่ ทั้งนี้รถยังมีโหมดขับเคลื่อนไฟฟ้าล้วนได้อีกด้วย");
        cars.add(car);

        Car car2 = new Car();
        car2.setCar_name("LAMBORGHINI");
        car2.setCar_image("https://i.pinimg.com/564x/1d/e2/87/1de287bba15fee2a16476f3e081f09dc.jpg");
        car2.setCar_price("24000000");
        car2.setCar_model("Lamborghini Gallardo");
        car2.setCar_year("2003-2013");
        car2.setCar_description(" Lamborghini Gallardo เป็นหนึ่งในรถสปอร์ตที่มีชื่อเสียงของแลมโบร์กินี มาพร้อมกับเครื่องยนต์ V10 ขนาด 5.0-5.2 ลิตร ให้กำลังสูงถึง 500-570 แรงม้า มีดีไซน์ที่โดดเด่นและความเร็วที่ท้าทายท้องถนน");
        cars.add(car2);

        Car car3 = new Car();
        car3.setCar_name("AUDI");
        car3.setCar_image("https://i.pinimg.com/564x/74/3d/ef/743def373175dec9c712f233a7c5bd80.jpg");
        car3.setCar_price("6000000");
        car3.setCar_model("Audi R8");
        car3.setCar_year("2006-ปัจจุบัน");
        car3.setCar_description(" Audi R8 เป็นซุปเปอร์คาร์ที่มีการออกแบบที่ลงตัวทั้งความสวยงามและสมรรถนะ มาพร้อมกับเครื่องยนต์ V10 และมีระบบขับเคลื่อนสี่ล้อ quattro ซึ่งทำให้การขับขี่มีเสถียรภาพมากขึ้น นอกจากนี้ยังเป็นที่รู้จักจากการใช้เทคโนโลยีอันล้ำหน้าในรถสปอร์ต");
        cars.add(car3);

        Car car4 = new Car();
        car4.setCar_name("JAGUAR");
        car4.setCar_image("https://img.freepik.com/premium-photo/car-isolated-white-background-jaguar-xj-white-car-blank-clean-white-background-white-black_655090-607354.jpg");
        car4.setCar_price("2000000");
        car4.setCar_model("Jaguar XJ");
        car4.setCar_year("1968-2019");
        car4.setCar_description("Jaguar XJ เป็นรถซีดานหรูที่โดดเด่นด้วยการออกแบบที่ผสมผสานความหรูหราและสมรรถนะที่ยอดเยี่ยม มาพร้อมกับเครื่องยนต์ตั้งแต่ 3.0 ลิตร ไปจนถึงเครื่องยนต์ V8 5.0 ลิตร มีเทคโนโลยีและฟังก์ชันอำนวยความสะดวกที่ทันสมัย");
        cars.add(car4);

        Car car5 = new Car();
        car5.setCar_name("MCLAREN");
        car5.setCar_image("https://img.freepik.com/premium-photo/car-isolated-white-background-mclaren-570s-lightweight-trackfocused-midengi-white-black_655090-717566.jpg");
        car5.setCar_price("17000000");
        car5.setCar_model("McLaren 570S");
        car5.setCar_year("2015-2021");
        car5.setCar_description("McLaren 570S เป็นซุปเปอร์คาร์ที่เน้นสมรรถนะการขับขี่สูง มีน้ำหนักเบาและโครงสร้างเป็นคาร์บอนไฟเบอร์ มาพร้อมกับเครื่องยนต์ V8 เทอร์โบคู่ ขนาด 3.8 ลิตร ให้กำลัง 570 แรงม้า การเร่งจาก 0-100 กม./ชม. ใช้เวลาเพียง 3.2 วินาที");
        cars.add(car5);

        Car car6 = new Car();
        car6.setCar_name("NISSAN");
        car6.setCar_image("https://images8.alphacoders.com/112/1128203.jpg");
        car6.setCar_price("18000000");
        car6.setCar_model("Nissan GT-R R34");
        car6.setCar_year("1999-2002");
        car6.setCar_description("Nissan GT-R R34 เป็นรถสปอร์ตที่เป็นที่รักในหมู่คนรักความเร็ว มีเครื่องยนต์ RB26DETT 6 สูบแถวเรียง เทอร์โบคู่ ขนาด 2.6 ลิตร ให้กำลังประมาณ 280 แรงม้า และระบบขับเคลื่อนสี่ล้อ (AWD) เป็นที่รู้จักจากภาพลักษณ์ที่เด่นชัดในภาพยนตร์และวัฒนธรรมรถแข่ง");
        cars.add(car6);

        mAdapter = new MyAdapter(cars, this);
        recyclerView.setAdapter(mAdapter);
    }
}