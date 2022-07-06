package desing.pattern.structure.flyweight;

import javafx.scene.paint.Color;

public class FlyweightTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FontData fdata = FontData.create(10, "fontface", new Color(0, 0, 0, 0), FontEffect.ITALIC, FontEffect.STRIKETHROUGH);
		System.out.println(fdata);
		
		FontData fdata2 = FontData.create(10, "fontface", new Color(0, 0, 0, 0), FontEffect.ITALIC, FontEffect.STRIKETHROUGH);		
		System.out.println(fdata2);
	}

}
