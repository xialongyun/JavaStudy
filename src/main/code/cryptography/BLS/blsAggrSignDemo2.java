package main.code.cryptography.BLS;

import it.unisa.dia.gas.jpbc.Element;
import it.unisa.dia.gas.jpbc.Field;
import it.unisa.dia.gas.jpbc.Pairing;
import it.unisa.dia.gas.plaf.jpbc.pairing.PairingFactory;

public class blsAggrSignDemo2 {
    public static void main(String[] args) {
        Pairing pairing = PairingFactory.getPairing("a.properties");//不同type的pairing主要调整这一步

        //根据pairing生成对应Field
        Field<Element> Zr = pairing.getZr();
        Field<Element> G1 = pairing.getG1();
        Field<Element> GT = pairing.getGT();
        Field<Element> G2 = pairing.getG2();

        //使用Field生成元素
        //Element g = G1.newElement();
        Element g = G1.newRandomElement().getImmutable();
        //也可以写成g = G1.newElement().newRandomElement().getImmutable();
        //表示从G1群中随机生成一个不可变的元素g
        //getImmutable()这个方法表示生成以后该元素的值不再变化
        //Element g2 = G2.newElement();
        Element g2 = G2.newRandomElement().getImmutable();
        //Element g1 = GT.newElement();
        Element g1 = GT.newRandomElement().getImmutable();

        //私钥
        Element pk0 = Zr.newRandomElement();
        Element pk1 = Zr.newRandomElement();
        Element pk2 = Zr.newRandomElement();
        //公钥
        Element P0 = g.duplicate().powZn(pk0);
        Element P1 = g.duplicate().powZn(pk1);
        Element P2 = g.duplicate().powZn(pk2);

        String s_p0 = P0.toString();
        String s_p1 = P1.toString();
        String s_p2 = P2.toString();
        String s_p012 = s_p0 + s_p1 + s_p2;
        Element a0 = G1.newElementFromBytes((s_p0 + s_p012).getBytes());
        Element a1 = G1.newElementFromBytes((s_p1 + s_p012).getBytes());
        Element a2 = G1.newElementFromBytes((s_p2 + s_p012).getBytes());


        //要签名的消息
        String message="message";
        byte[] m=Integer.toString(message.hashCode()).getBytes();
        //byte[] m=message.getBytes();
        //生成H(m) 将消息哈希H(m)映射到曲线上的点,记为q
        Element q=pairing.getG1().newRandomElement().setFromHash(m,0,m.length).getImmutable();
        //将结果点乘以私钥得到签名: S = pk × q
        Element S0=q.duplicate().powZn(pk0).getImmutable();
        Element S1=q.duplicate().powZn(pk1).getImmutable();
        Element S2=q.duplicate().powZn(pk2).getImmutable();

        Element P = P0.mul(a0).add(P1.mul(a1)).add(P2.mul(a2));
        Element S = S0.mul(a0).add(S1.mul(a1)).add(S2.mul(a2));

        //验证
        //验证
        Element pl = pairing.pairing(g, S);//g ,sig均为公共参数
        Element pr = pairing.pairing(q, P);//h,公钥均为公共参数
        if (pl.isEqual(pr))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
