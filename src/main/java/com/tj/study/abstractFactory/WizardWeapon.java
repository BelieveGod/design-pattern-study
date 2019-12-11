package com.tj.study.abstractFactory;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class WizardWeapon implements Weapon {

	JScrollPane sp;
	JFrame jf=new JFrame("抽象工厂模式测试");
		
	public WizardWeapon(){
		String path=WarriorClothes.class.getClassLoader().getResource("").getPath();
		String file=path+"static/image/wizard-weapon.jpg";
		System.out.println("file:"+file);
		Container contentPane=jf.getContentPane();
		JPanel p1=new JPanel();
		p1.setLayout(new GridLayout(1,1));
		p1.setBorder(BorderFactory.createTitledBorder("武器：爆力魔杖"));
		sp=new JScrollPane(p1);
		contentPane.add(sp, BorderLayout.CENTER);
		JLabel l1=new JLabel(new ImageIcon(file));
		p1.add(l1); 
		jf.pack();
		jf.setVisible(false);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//用户点击窗口关闭 
	}
	
	@Override
	public void show() {
		jf.setVisible(true);
	}

}
