package o;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public final class bS implements Runnable, C3103 {

    /* renamed from: o.bS$ǃ  reason: contains not printable characters */
    public static class C0123 implements Externalizable {

        /* renamed from: ı  reason: contains not printable characters */
        String f1694 = "";

        /* renamed from: Ɩ  reason: contains not printable characters */
        boolean f1695;

        /* renamed from: ǃ  reason: contains not printable characters */
        List<String> f1696 = new ArrayList();

        /* renamed from: ɩ  reason: contains not printable characters */
        String f1697 = "";

        /* renamed from: ɹ  reason: contains not printable characters */
        private String f1698 = "";

        /* renamed from: Ι  reason: contains not printable characters */
        boolean f1699 = false;

        /* renamed from: ι  reason: contains not printable characters */
        String f1700 = "";

        /* renamed from: і  reason: contains not printable characters */
        private boolean f1701;

        public final void writeExternal(ObjectOutput objectOutput) {
            objectOutput.writeUTF(this.f1700);
            objectOutput.writeUTF(this.f1694);
            int size = this.f1696.size();
            objectOutput.writeInt(size);
            for (int i = 0; i < size; i++) {
                objectOutput.writeUTF(this.f1696.get(i));
            }
            objectOutput.writeBoolean(this.f1701);
            if (this.f1701) {
                objectOutput.writeUTF(this.f1697);
            }
            objectOutput.writeBoolean(this.f1695);
            if (this.f1695) {
                objectOutput.writeUTF(this.f1698);
            }
            objectOutput.writeBoolean(this.f1699);
        }

        public final void readExternal(ObjectInput objectInput) {
            this.f1700 = objectInput.readUTF();
            this.f1694 = objectInput.readUTF();
            int readInt = objectInput.readInt();
            for (int i = 0; i < readInt; i++) {
                this.f1696.add(objectInput.readUTF());
            }
            if (objectInput.readBoolean()) {
                String readUTF = objectInput.readUTF();
                this.f1701 = true;
                this.f1697 = readUTF;
            }
            if (objectInput.readBoolean()) {
                String readUTF2 = objectInput.readUTF();
                this.f1695 = true;
                this.f1698 = readUTF2;
            }
            this.f1699 = objectInput.readBoolean();
        }
    }

    /* renamed from: o.bS$if  reason: invalid class name */
    public static class Cif implements Externalizable {

        /* renamed from: ı  reason: contains not printable characters */
        private String f1688 = "";

        /* renamed from: ǃ  reason: contains not printable characters */
        private List<Integer> f1689 = new ArrayList();

        /* renamed from: ɩ  reason: contains not printable characters */
        private boolean f1690;

        /* renamed from: Ι  reason: contains not printable characters */
        private List<Integer> f1691 = new ArrayList();

        /* renamed from: ι  reason: contains not printable characters */
        private boolean f1692;

        /* renamed from: І  reason: contains not printable characters */
        private String f1693 = "";

        public final void writeExternal(ObjectOutput objectOutput) {
            objectOutput.writeBoolean(this.f1690);
            if (this.f1690) {
                objectOutput.writeUTF(this.f1688);
            }
            int size = this.f1691.size();
            objectOutput.writeInt(size);
            for (int i = 0; i < size; i++) {
                objectOutput.writeInt(this.f1691.get(i).intValue());
            }
            int size2 = this.f1689.size();
            objectOutput.writeInt(size2);
            for (int i2 = 0; i2 < size2; i2++) {
                objectOutput.writeInt(this.f1689.get(i2).intValue());
            }
            objectOutput.writeBoolean(this.f1692);
            if (this.f1692) {
                objectOutput.writeUTF(this.f1693);
            }
        }

        public final void readExternal(ObjectInput objectInput) {
            if (objectInput.readBoolean()) {
                String readUTF = objectInput.readUTF();
                this.f1690 = true;
                this.f1688 = readUTF;
            }
            int readInt = objectInput.readInt();
            for (int i = 0; i < readInt; i++) {
                this.f1691.add(Integer.valueOf(objectInput.readInt()));
            }
            int readInt2 = objectInput.readInt();
            for (int i2 = 0; i2 < readInt2; i2++) {
                this.f1689.add(Integer.valueOf(objectInput.readInt()));
            }
            if (objectInput.readBoolean()) {
                String readUTF2 = objectInput.readUTF();
                this.f1692 = true;
                this.f1693 = readUTF2;
            }
        }
    }

    public static class If implements Externalizable {

        /* renamed from: ı  reason: contains not printable characters */
        boolean f1633;

        /* renamed from: ıı  reason: contains not printable characters */
        private String f1634 = "";

        /* renamed from: ıǃ  reason: contains not printable characters */
        private boolean f1635 = false;

        /* renamed from: ŀ  reason: contains not printable characters */
        private Cif f1636 = null;

        /* renamed from: ł  reason: contains not printable characters */
        private Cif f1637 = null;

        /* renamed from: ſ  reason: contains not printable characters */
        private boolean f1638;

        /* renamed from: Ɩ  reason: contains not printable characters */
        private Cif f1639 = null;

        /* renamed from: Ɨ  reason: contains not printable characters */
        private Cif f1640 = null;

        /* renamed from: ƚ  reason: contains not printable characters */
        private boolean f1641;

        /* renamed from: ǀ  reason: contains not printable characters */
        private boolean f1642;

        /* renamed from: ǃ  reason: contains not printable characters */
        List<C0123> f1643 = new ArrayList();

        /* renamed from: ǃı  reason: contains not printable characters */
        private String f1644 = "";

        /* renamed from: ǃǃ  reason: contains not printable characters */
        private boolean f1645 = false;

        /* renamed from: ȷ  reason: contains not printable characters */
        private boolean f1646;

        /* renamed from: ɂ  reason: contains not printable characters */
        private boolean f1647 = false;

        /* renamed from: Ɉ  reason: contains not printable characters */
        private boolean f1648;

        /* renamed from: ɍ  reason: contains not printable characters */
        private boolean f1649;

        /* renamed from: ɔ  reason: contains not printable characters */
        private boolean f1650;

        /* renamed from: ɟ  reason: contains not printable characters */
        private Cif f1651 = null;

        /* renamed from: ɨ  reason: contains not printable characters */
        private Cif f1652 = null;

        /* renamed from: ɩ  reason: contains not printable characters */
        String f1653 = "";

        /* renamed from: ɪ  reason: contains not printable characters */
        private boolean f1654;

        /* renamed from: ɭ  reason: contains not printable characters */
        private boolean f1655;

        /* renamed from: ɹ  reason: contains not printable characters */
        private Cif f1656 = null;

        /* renamed from: ɺ  reason: contains not printable characters */
        private Cif f1657 = null;

        /* renamed from: ɻ  reason: contains not printable characters */
        private String f1658 = "";

        /* renamed from: ɼ  reason: contains not printable characters */
        private Cif f1659 = null;

        /* renamed from: ɾ  reason: contains not printable characters */
        private boolean f1660;

        /* renamed from: ɿ  reason: contains not printable characters */
        private Cif f1661 = null;

        /* renamed from: ʅ  reason: contains not printable characters */
        private Cif f1662 = null;

        /* renamed from: ʏ  reason: contains not printable characters */
        private boolean f1663;

        /* renamed from: ʔ  reason: contains not printable characters */
        private String f1664 = "";

        /* renamed from: ʕ  reason: contains not printable characters */
        private String f1665 = "";

        /* renamed from: ʖ  reason: contains not printable characters */
        private boolean f1666;

        /* renamed from: ʟ  reason: contains not printable characters */
        private boolean f1667;

        /* renamed from: ͻ  reason: contains not printable characters */
        private boolean f1668;

        /* renamed from: Γ  reason: contains not printable characters */
        private String f1669 = "";

        /* renamed from: Ι  reason: contains not printable characters */
        String f1670 = "";

        /* renamed from: ι  reason: contains not printable characters */
        int f1671 = 0;

        /* renamed from: τ  reason: contains not printable characters */
        private boolean f1672;

        /* renamed from: ϲ  reason: contains not printable characters */
        private boolean f1673;

        /* renamed from: ϳ  reason: contains not printable characters */
        private Cif f1674 = null;

        /* renamed from: І  reason: contains not printable characters */
        List<C0123> f1675 = new ArrayList();

        /* renamed from: Ј  reason: contains not printable characters */
        private Cif f1676 = null;

        /* renamed from: Г  reason: contains not printable characters */
        private boolean f1677;

        /* renamed from: г  reason: contains not printable characters */
        private boolean f1678;

        /* renamed from: с  reason: contains not printable characters */
        private boolean f1679;

        /* renamed from: т  reason: contains not printable characters */
        private Cif f1680 = null;

        /* renamed from: х  reason: contains not printable characters */
        private Cif f1681 = null;

        /* renamed from: і  reason: contains not printable characters */
        private boolean f1682;

        /* renamed from: ј  reason: contains not printable characters */
        private Cif f1683 = null;

        /* renamed from: ґ  reason: contains not printable characters */
        private boolean f1684;

        /* renamed from: Ӏ  reason: contains not printable characters */
        private boolean f1685;

        /* renamed from: ӏ  reason: contains not printable characters */
        private Cif f1686 = null;

        /* renamed from: ӷ  reason: contains not printable characters */
        private boolean f1687 = false;

        public final void writeExternal(ObjectOutput objectOutput) {
            objectOutput.writeBoolean(this.f1682);
            if (this.f1682) {
                this.f1639.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.f1685);
            if (this.f1685) {
                this.f1656.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.f1660);
            if (this.f1660) {
                this.f1652.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.f1654);
            if (this.f1654) {
                this.f1686.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.f1646);
            if (this.f1646) {
                this.f1636.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.f1667);
            if (this.f1667) {
                this.f1637.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.f1678);
            if (this.f1678) {
                this.f1661.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.f1638);
            if (this.f1638) {
                this.f1662.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.f1649);
            if (this.f1649) {
                this.f1640.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.f1641);
            if (this.f1641) {
                this.f1651.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.f1650);
            if (this.f1650) {
                this.f1659.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.f1642);
            if (this.f1642) {
                this.f1657.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.f1668);
            if (this.f1668) {
                this.f1676.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.f1679);
            if (this.f1679) {
                this.f1674.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.f1673);
            if (this.f1673) {
                this.f1680.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.f1684);
            if (this.f1684) {
                this.f1683.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.f1655);
            if (this.f1655) {
                this.f1681.writeExternal(objectOutput);
            }
            objectOutput.writeUTF(this.f1665);
            objectOutput.writeInt(this.f1671);
            objectOutput.writeUTF(this.f1653);
            objectOutput.writeBoolean(this.f1663);
            if (this.f1663) {
                objectOutput.writeUTF(this.f1664);
            }
            objectOutput.writeBoolean(this.f1666);
            if (this.f1666) {
                objectOutput.writeUTF(this.f1658);
            }
            objectOutput.writeBoolean(this.f1672);
            if (this.f1672) {
                objectOutput.writeUTF(this.f1634);
            }
            objectOutput.writeBoolean(this.f1633);
            if (this.f1633) {
                objectOutput.writeUTF(this.f1670);
            }
            objectOutput.writeBoolean(this.f1677);
            if (this.f1677) {
                objectOutput.writeUTF(this.f1669);
            }
            objectOutput.writeBoolean(this.f1687);
            int size = this.f1643.size();
            objectOutput.writeInt(size);
            for (int i = 0; i < size; i++) {
                this.f1643.get(i).writeExternal(objectOutput);
            }
            int size2 = this.f1675.size();
            objectOutput.writeInt(size2);
            for (int i2 = 0; i2 < size2; i2++) {
                this.f1675.get(i2).writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.f1647);
            objectOutput.writeBoolean(this.f1648);
            if (this.f1648) {
                objectOutput.writeUTF(this.f1644);
            }
            objectOutput.writeBoolean(this.f1635);
            objectOutput.writeBoolean(this.f1645);
        }

        public final void readExternal(ObjectInput objectInput) {
            if (objectInput.readBoolean()) {
                Cif ifVar = new Cif();
                ifVar.readExternal(objectInput);
                this.f1682 = true;
                this.f1639 = ifVar;
            }
            if (objectInput.readBoolean()) {
                Cif ifVar2 = new Cif();
                ifVar2.readExternal(objectInput);
                this.f1685 = true;
                this.f1656 = ifVar2;
            }
            if (objectInput.readBoolean()) {
                Cif ifVar3 = new Cif();
                ifVar3.readExternal(objectInput);
                this.f1660 = true;
                this.f1652 = ifVar3;
            }
            if (objectInput.readBoolean()) {
                Cif ifVar4 = new Cif();
                ifVar4.readExternal(objectInput);
                this.f1654 = true;
                this.f1686 = ifVar4;
            }
            if (objectInput.readBoolean()) {
                Cif ifVar5 = new Cif();
                ifVar5.readExternal(objectInput);
                this.f1646 = true;
                this.f1636 = ifVar5;
            }
            if (objectInput.readBoolean()) {
                Cif ifVar6 = new Cif();
                ifVar6.readExternal(objectInput);
                this.f1667 = true;
                this.f1637 = ifVar6;
            }
            if (objectInput.readBoolean()) {
                Cif ifVar7 = new Cif();
                ifVar7.readExternal(objectInput);
                this.f1678 = true;
                this.f1661 = ifVar7;
            }
            if (objectInput.readBoolean()) {
                Cif ifVar8 = new Cif();
                ifVar8.readExternal(objectInput);
                this.f1638 = true;
                this.f1662 = ifVar8;
            }
            if (objectInput.readBoolean()) {
                Cif ifVar9 = new Cif();
                ifVar9.readExternal(objectInput);
                this.f1649 = true;
                this.f1640 = ifVar9;
            }
            if (objectInput.readBoolean()) {
                Cif ifVar10 = new Cif();
                ifVar10.readExternal(objectInput);
                this.f1641 = true;
                this.f1651 = ifVar10;
            }
            if (objectInput.readBoolean()) {
                Cif ifVar11 = new Cif();
                ifVar11.readExternal(objectInput);
                this.f1650 = true;
                this.f1659 = ifVar11;
            }
            if (objectInput.readBoolean()) {
                Cif ifVar12 = new Cif();
                ifVar12.readExternal(objectInput);
                this.f1642 = true;
                this.f1657 = ifVar12;
            }
            if (objectInput.readBoolean()) {
                Cif ifVar13 = new Cif();
                ifVar13.readExternal(objectInput);
                this.f1668 = true;
                this.f1676 = ifVar13;
            }
            if (objectInput.readBoolean()) {
                Cif ifVar14 = new Cif();
                ifVar14.readExternal(objectInput);
                this.f1679 = true;
                this.f1674 = ifVar14;
            }
            if (objectInput.readBoolean()) {
                Cif ifVar15 = new Cif();
                ifVar15.readExternal(objectInput);
                this.f1673 = true;
                this.f1680 = ifVar15;
            }
            if (objectInput.readBoolean()) {
                Cif ifVar16 = new Cif();
                ifVar16.readExternal(objectInput);
                this.f1684 = true;
                this.f1683 = ifVar16;
            }
            if (objectInput.readBoolean()) {
                Cif ifVar17 = new Cif();
                ifVar17.readExternal(objectInput);
                this.f1655 = true;
                this.f1681 = ifVar17;
            }
            this.f1665 = objectInput.readUTF();
            this.f1671 = objectInput.readInt();
            this.f1653 = objectInput.readUTF();
            if (objectInput.readBoolean()) {
                String readUTF = objectInput.readUTF();
                this.f1663 = true;
                this.f1664 = readUTF;
            }
            if (objectInput.readBoolean()) {
                String readUTF2 = objectInput.readUTF();
                this.f1666 = true;
                this.f1658 = readUTF2;
            }
            if (objectInput.readBoolean()) {
                String readUTF3 = objectInput.readUTF();
                this.f1672 = true;
                this.f1634 = readUTF3;
            }
            if (objectInput.readBoolean()) {
                String readUTF4 = objectInput.readUTF();
                this.f1633 = true;
                this.f1670 = readUTF4;
            }
            if (objectInput.readBoolean()) {
                String readUTF5 = objectInput.readUTF();
                this.f1677 = true;
                this.f1669 = readUTF5;
            }
            this.f1687 = objectInput.readBoolean();
            int readInt = objectInput.readInt();
            for (int i = 0; i < readInt; i++) {
                C0123 r4 = new C0123();
                r4.readExternal(objectInput);
                this.f1643.add(r4);
            }
            int readInt2 = objectInput.readInt();
            for (int i2 = 0; i2 < readInt2; i2++) {
                C0123 r3 = new C0123();
                r3.readExternal(objectInput);
                this.f1675.add(r3);
            }
            this.f1647 = objectInput.readBoolean();
            if (objectInput.readBoolean()) {
                String readUTF6 = objectInput.readUTF();
                this.f1648 = true;
                this.f1644 = readUTF6;
            }
            this.f1635 = objectInput.readBoolean();
            this.f1645 = objectInput.readBoolean();
        }
    }

    public final void run() {
        C2859.m14850();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final HttpURLConnection m1719(URL url) {
        return (HttpURLConnection) url.openConnection();
    }
}
