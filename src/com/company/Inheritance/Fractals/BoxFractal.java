package com.company.Inheritance.Fractals;
    import java.awt.Graphics;
    import java.awt.Color;
    import java.awt.Container;
    import javax.swing.JFrame;
    import javax.swing.JPanel;

public class BoxFractal extends JPanel{
    private int levels;
    public BoxFractal(int lev)
    {
        levels = lev;
    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);  // Call JPanel's paintComponent method
        //   to paint the background
        int xCenter = getWidth() / 2;
        int yCenter = getHeight() / 2;

        int x = xCenter - 243;
        int y = yCenter - 243;

        int width = 486;
        int height = 486;

        g.setColor(Color.RED);
        drawAndSplit(g, x, y, width, height, levels);

    }
    public void drawAndSplit(Graphics g, int x, int y, int width, int height, int times)
    {
        if(times == 0){
            return;
        }
        if(times == 1){
            g.fillRect(x,y,width,height);
        }
        else{
            drawAndSplit(g, x, y, height / 3, width / 3, times - 1);
            drawAndSplit(g, x + 2 * (width / 3), y, height / 3, width / 3, times - 1);
            drawAndSplit(g, x, y + 2 * (height / 3), height / 3, width / 3, times - 1);
            drawAndSplit(g, x + 2 * (width / 3), y + 2 * (height / 3), height / 3, width / 3, times - 1);
            drawAndSplit(g, x + (width / 3), y + (height / 3), height / 3, width / 3, times - 1);
        }
    }
    public static void main(String[] args)
    {
        JFrame window = new JFrame("Fractals");
        window.setBounds(200, 200, 500, 500);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BoxFractal panel = new BoxFractal(2);
        panel.setBackground(Color.WHITE);
        Container c = window.getContentPane();
        c.add(panel);
        window.setVisible(true);
    }
}
