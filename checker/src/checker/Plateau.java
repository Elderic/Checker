package checker;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Main GUI class for chronometer.
 * 
 * @author Tianxiao.Liu@u-cergy.fr
 **/
public class Plateau extends JFrame {
	private static final Dimension IDEAL_MAIN_DIMENSION = new Dimension(800, 800);
	private static final Dimension IDEAL_DASHBOARD_DIMENSION = new Dimension(800, 800);
	private static final int NB_CASE=14;
	private static final long serialVersionUID = 1L;
	Point point[] = new Point[117];
	Point yellowPoint[] = new Point[10];
	Point blackPoint[] = new Point[10];
	Point redPoint[] = new Point[10];
	Point bluePoint[] = new Point[10];
	private JPanel control = new JPanel();
	private Dessiner draw = new Dessiner();
	public Plateau(String title) {
		super(title);
		init();
	}

	private void init() {
		creerCase();

		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());

		control.setLayout(new FlowLayout(FlowLayout.CENTER));
		contentPane.add(BorderLayout.NORTH, control);
		draw.setPreferredSize(IDEAL_DASHBOARD_DIMENSION);
		contentPane.add(BorderLayout.SOUTH, draw);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true);
		setPreferredSize(IDEAL_MAIN_DIMENSION);
	}

	private void creerCase() {
		yellowPoint[0]= new Point(590, 700);
		yellowPoint[1]= new Point(620, 700);
		yellowPoint[2]= new Point(650, 700);
		yellowPoint[3]= new Point(680, 700);
		yellowPoint[4]= new Point(710, 700);
		//ligne2
		yellowPoint[5]= new Point(605, 680);
		yellowPoint[6]= new Point(635, 680);
		yellowPoint[7]= new Point(665, 680);
		yellowPoint[8]= new Point(695, 680);
		//ligne3
		yellowPoint[9]= new Point(650, 660);
		point[0]= new Point(620, 660);
		point[1]= new Point(680, 660);
		blackPoint[4]=new Point(500, 660);
		redPoint[0]=new Point(800, 660);
		//ligne 4
		point[2]= new Point(605, 640);
		point[3]= new Point(635, 640);
		point[4]= new Point(665, 640);
		point[5]= new Point(695, 640);
		blackPoint[3]=new Point(485, 640);
		blackPoint[8]=new Point(515, 640);
		redPoint[5]=new Point(785, 640);
		redPoint[1]=new Point(815, 640);
		//ligne 5
		blackPoint[2]= new Point(470, 620);
		blackPoint[7]= new Point(500, 620);
		point[6]= new Point(530, 620);
		point[7]= new Point(560, 620);
		point[8]= new Point(590, 620);
		point[9]= new Point(620, 620);
		point[10]= new Point(650, 620);
		point[11]= new Point(680, 620);
		point[12]= new Point(710, 620);
		point[13]= new Point(740, 620);
		point[14]= new Point(770, 620);
		redPoint[6]= new Point(800, 620);
		redPoint[2]= new Point(830, 620);
		//ligne 6
		blackPoint[1]= new Point(455, 600);
		blackPoint[6]= new Point(485, 600);
		blackPoint[9]= new Point(515, 600);
		point[15]= new Point(545, 600);
		point[16]= new Point(575, 600);
		point[17]= new Point(605, 600);
		point[18]= new Point(635, 600);
		point[19]= new Point(665, 600);
		point[20]= new Point(695, 600);
		point[21]= new Point(725, 600);
		point[22]= new Point(755, 600);
		redPoint[9]= new Point(785, 600);
		redPoint[7]= new Point(815, 600);
		redPoint[3]= new Point(845, 600);
		//ligne 7
		blackPoint[0]=new Point(440, 580);
		blackPoint[5]=new Point(470, 580);
		point[23]=new Point(500,580);
		point[24]=new Point(530,580);
		point[25]=new Point(560,580);
		point[26]=new Point(590,580);
		point[27]=new Point(620,580);
		point[28]=new Point(650,580);
		point[29]=new Point(680,580);
		point[30]=new Point(710,580);
		point[31]=new Point(740,580);
		point[32]=new Point(770,580);
		point[33]=new Point(800,580);
		redPoint[8]=new Point(860,580);
		redPoint[4]=new Point(830,580);
		//ligne8
		point[34]=new Point(515,560);
		point[35]=new Point(545,560);
		point[36]=new Point(575,560);
		point[37]=new Point(605,560);
		point[38]=new Point(635,560);
		point[39]=new Point(665,560);
		point[40]=new Point(695,560);
		point[41]=new Point(725,560);
		point[42]=new Point(755,560);
		point[43]=new Point(785,560);
		//ligne9
		point[44]=new Point(530,540);
		point[45]=new Point(560,540);
		point[46]=new Point(590,540);
		point[47]=new Point(620,540);
		point[48]=new Point(650,540);
		point[49]=new Point(680,540);
		point[50]=new Point(710,540);
		point[51]=new Point(740,540);
		point[52]=new Point(770,540);
		//ligne10
		point[53]=new Point(515,520);
		point[54]=new Point(545,520);
		point[55]=new Point(575,520);
		point[56]=new Point(605,520);
		point[57]=new Point(635,520);
		point[58]=new Point(665,520);
		point[59]=new Point(695,520);
		point[60]=new Point(725,520);
		point[61]=new Point(755,520);
		point[62]=new Point(785,520);
		//ligne11
		point[63]=new Point(440, 500);
		point[64]=new Point(470, 500);
		point[65]=new Point(500,500);
		point[66]=new Point(530,500);
		point[67]=new Point(560,500);
		point[68]=new Point(590,500);
		point[69]=new Point(620,500);
		point[70]=new Point(650,500);
		point[71]=new Point(680,500);
		point[72]=new Point(710,500);
		point[73]=new Point(740,500);
		point[74]=new Point(770,500);
		point[75]=new Point(800,500);
		point[76]=new Point(830,500);
		point[77]=new Point(860, 500);
		//ligne12
		point[78]= new Point(455, 480);
		point[79]= new Point(485, 480);
		point[80]= new Point(515, 480);
		point[81]= new Point(545, 480);
		point[82]= new Point(575, 480);
		point[83]= new Point(605, 480);
		point[84]= new Point(635, 480);
		point[85]= new Point(665, 480);
		point[86]= new Point(695, 480);
		point[87]= new Point(725, 480);
		point[88]= new Point(755, 480);
		point[89]= new Point(785, 480);
		point[90]= new Point(815, 480);
		point[91]= new Point(845, 480);
		//ligne13
		point[92]= new Point(470, 460);
		point[93]= new Point(500, 460);
		point[94]= new Point(530, 460);
		point[95]= new Point(560, 460);
		point[96]= new Point(590, 460);
		point[97]= new Point(620, 460);
		point[98]= new Point(650, 460);
		point[99]= new Point(680, 460);
		point[100]= new Point(710, 460);
		point[101]= new Point(740, 460);
		point[102]= new Point(770, 460);
		point[103]= new Point(800, 460);
		point[104]= new Point(830, 460);
		//ligne14
		point[105]= new Point(605, 440);
		point[106]= new Point(635, 440);
		point[107]= new Point(665, 440);
		point[108]= new Point(695, 440);
		point[109]=new Point(485, 440);
		point[110]=new Point(515, 440);
		point[111]=new Point(815, 440);
		point[112]=new Point(785, 440);
		//ligne15
		bluePoint[9]= new Point(650, 420);
		point[113]= new Point(620, 420);
		point[114]= new Point(680, 420);
		point[115]=new Point(500, 420);
		point[116]=new Point(800, 420);
		//ligne16
		bluePoint[5]= new Point(605, 400);
		bluePoint[6]= new Point(635, 400);
		bluePoint[7]= new Point(665, 400);
		bluePoint[8]= new Point(695, 400);
		//ligne17
		bluePoint[0]= new Point(590, 380);
		bluePoint[1]= new Point(620, 380);
		bluePoint[2]= new Point(650, 380);
		bluePoint[3]= new Point(680, 380);
		bluePoint[4]= new Point(710, 380);
		
		for(int i=0;i<point.length;i++) {
			if(i<bluePoint.length) {
				draw.addBlackArrayList(blackPoint[i]);
				draw.addRedArrayList(redPoint[i]);	
				draw.addYellowArrayList(yellowPoint[i]);	
				draw.addBlueArrayList(bluePoint[i]);	
			}
			draw.addArrayList(point[i]);
		}
	}

	public static void main(String[] args) {
		new Plateau("Checker");
	}

}

		
		
		
		
		
		
