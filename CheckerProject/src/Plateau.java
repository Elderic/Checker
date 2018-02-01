	import java.awt.BorderLayout;
	import java.awt.Container;
	import java.awt.Dimension;
	import java.awt.FlowLayout;
	import java.awt.Point;

	import javax.swing.JFrame;
	import javax.swing.JPanel;

	public class Plateau extends JFrame {
		private static final Dimension IDEAL_MAIN_DIMENSION = new Dimension(800, 800);
		private static final Dimension IDEAL_DASHBOARD_DIMENSION = new Dimension(800, 800);
		private static final long serialVersionUID = 1L;
		Point point[] = new Point[117];
		Point yellowPoint[] = new Point[10];
		Point blackPoint[] = new Point[10];
		Point redPoint[] = new Point[10];
		Point bluePoint[] = new Point[10];
		/*Point greenPoint[] = new Point[10];
		Point whitePoint[] = new Point[10];*/
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
			yellowPoint[0]= new Point(590,400);
			yellowPoint[1]= new Point(620,400);
			yellowPoint[2]= new Point(650,400);
			yellowPoint[3]= new Point(680,400);
			yellowPoint[4]= new Point(710,400);
			//line2
			yellowPoint[5]= new Point(605,375);
			yellowPoint[6]= new Point(635,375);
			yellowPoint[7]= new Point(665,375);
			yellowPoint[8]= new Point(695,375);
			//line3
			yellowPoint[9]= new Point(650,350);
			point[0]= new Point(620,350);
			point[1]= new Point(680,350);
			blackPoint[4]=new Point(500,350);
			redPoint[0]=new Point(800,350);
			//line 4
			point[2]= new Point(605,325);
			point[3]= new Point(635,325);
			point[4]= new Point(665,325);
			point[5]= new Point(695,325);
			blackPoint[3]=new Point(485,325);
			blackPoint[8]=new Point(515,325);
			redPoint[5]=new Point(785,325);
			redPoint[1]=new Point(815,325);
			//line 5
			blackPoint[2]= new Point(470,300);
			blackPoint[7]= new Point(500,300);
			point[6]= new Point(530,300);
			point[7]= new Point(560,300);
			point[8]= new Point(590,300);
			point[9]= new Point(620,300);
			point[10]= new Point(650,300);
			point[11]= new Point(680,300);
			point[12]= new Point(710,300);
			point[13]= new Point(740,300);
			point[14]= new Point(770,300);
			redPoint[6]= new Point(800,300);
			redPoint[2]= new Point(830,300);
			//line 6
			blackPoint[1]= new Point(455,275);
			blackPoint[6]= new Point(485,275);
			blackPoint[9]= new Point(515,275);
			point[15]= new Point(545,275);
			point[16]= new Point(575,275);
			point[17]= new Point(605,275);
			point[18]= new Point(635,275);
			point[19]= new Point(665,275);
			point[20]= new Point(695,275);
			point[21]= new Point(725,275);
			point[22]= new Point(755,275);
			redPoint[9]= new Point(785,275);
			redPoint[7]= new Point(815,275);
			redPoint[3]= new Point(845,275);
			//line 7
			blackPoint[0]=new Point(440,250);
			blackPoint[5]=new Point(470,250);
			point[23]=new Point(500,250);
			point[24]=new Point(530,250);
			point[25]=new Point(560,250);
			point[26]=new Point(590,250);
			point[27]=new Point(620,250);
			point[28]=new Point(650,250);
			point[29]=new Point(680,250);
			point[30]=new Point(710,250);
			point[31]=new Point(740,250);
			point[32]=new Point(770,250);
			point[33]=new Point(800,250);
			redPoint[8]=new Point(860,250);
			redPoint[4]=new Point(830,250);
			//line8
			point[34]=new Point(515,225);
			point[35]=new Point(545,225);
			point[36]=new Point(575,225);
			point[37]=new Point(605,225);
			point[38]=new Point(635,225);
			point[39]=new Point(665,225);
			point[40]=new Point(695,225);
			point[41]=new Point(725,225);
			point[42]=new Point(755,225);
			point[43]=new Point(785,225);
			//line9
			point[44]=new Point(530,200);
			point[45]=new Point(560,200);
			point[46]=new Point(590,200);
			point[47]=new Point(620,200);
			point[48]=new Point(650,200);
			point[49]=new Point(680,200);
			point[50]=new Point(710,200);
			point[51]=new Point(740,200);
			point[52]=new Point(770,200);
			//line10
			point[53]=new Point(515,175);
			point[54]=new Point(545,175);
			point[55]=new Point(575,175);
			point[56]=new Point(605,175);
			point[57]=new Point(635,175);
			point[58]=new Point(665,175);
			point[59]=new Point(695,175);
			point[60]=new Point(725,175);
			point[61]=new Point(755,175);
			point[62]=new Point(785,175);
			//line11
			point[63]=new Point(440,150);
			point[64]=new Point(470,150);
			point[65]=new Point(500,150);
			point[66]=new Point(530,150);
			point[67]=new Point(560,150);
			point[68]=new Point(590,150);
			point[69]=new Point(620,150);
			point[70]=new Point(650,150);
			point[71]=new Point(680,150);
			point[72]=new Point(710,150);
			point[73]=new Point(740,150);
			point[74]=new Point(770,150);
			point[75]=new Point(800,150);
			point[76]=new Point(830,150);
			point[77]=new Point(860,150);
			//line12
			point[78]= new Point(455, 125);
			point[79]= new Point(485, 125);
			point[80]= new Point(515, 125);
			point[81]= new Point(545, 125);
			point[82]= new Point(575, 125);
			point[83]= new Point(605, 125);
			point[84]= new Point(635, 125);
			point[85]= new Point(665, 125);
			point[86]= new Point(695, 125);
			point[87]= new Point(725, 125);
			point[88]= new Point(755, 125);
			point[89]= new Point(785, 125);
			point[90]= new Point(815, 125);
			point[91]= new Point(845, 125);
			//line13
			point[92]= new Point(470, 100);
			point[93]= new Point(500, 100);
			point[94]= new Point(530, 100);
			point[95]= new Point(560, 100);
			point[96]= new Point(590, 100);
			point[97]= new Point(620, 100);
			point[98]= new Point(650, 100);
			point[99]= new Point(680, 100);
			point[100]= new Point(710, 100);
			point[101]= new Point(740, 100);
			point[102]= new Point(770, 100);
			point[103]= new Point(800, 100);
			point[104]= new Point(830, 100);
			//line14
			point[105]= new Point(605, 75);
			point[106]= new Point(635, 75);
			point[107]= new Point(665, 75);
			point[108]= new Point(695, 75);
			point[109]=new Point(485, 75);
			point[110]=new Point(515, 75);
			point[111]=new Point(815, 75);
			point[112]=new Point(785, 75);
			//line15
			bluePoint[9]= new Point(650,50);
			point[113]= new Point(620, 50);
			point[114]= new Point(680, 50);
			point[115]=new Point(500, 50);
			point[116]=new Point(800, 50);
			//line16
			bluePoint[5]= new Point(605, 25);
			bluePoint[6]= new Point(635, 25);
			bluePoint[7]= new Point(665, 25);
			bluePoint[8]= new Point(695, 25);
			//line17
			bluePoint[0]= new Point(590, 0);
			bluePoint[1]= new Point(620, 0);
			bluePoint[2]= new Point(650, 0);
			bluePoint[3]= new Point(680, 0);
			bluePoint[4]= new Point(710, 0);
			
			for(int i=0;i<point.length;i++) {
				if(i<bluePoint.length) {
					draw.addBlackArrayList(blackPoint[i]);
					draw.addRedArrayList(redPoint[i]);	
					draw.addYellowArrayList(yellowPoint[i]);	
					draw.addBlueArrayList(bluePoint[i]);	
					/*draw.addGreenArrayList(greenPoint[i]);
					draw.addWhiteArrayList(whitePoint[i]);*/
				}
				draw.addArrayList(point[i]);
			}
		}

		public static void main(String[] args) {
			new Plateau("Checker");
		}

	}

