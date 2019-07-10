package self.learn.ex.creative.prototype;

import java.util.Arrays;

/**
 *
 * @author realive
 * @version 2019/7/10
 */
public class QPrototype implements Cloneable {
    private Man[] mans;

    public QPrototype() {
        mans = new Man[]{new Man(1, 2), new Man(2, 3), new Man(3, 4)};
    }

    public QPrototype(Man[] mans) {
        this.mans = mans;
    }

    public Man[] getMans() {
        return mans;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        QPrototype copy = (QPrototype)super.clone();
        copy.mans = new Man[mans.length];
        for (int i = 0; i < mans.length; ++i) {
            copy.mans[i] = (Man)mans[i].clone();
        }
        return copy;
    }

    @Override
    public String toString() {
        return "QPrototype{" + "mans=" + Arrays.toString(mans) + '}';
    }

    static class Man implements Cloneable {
        private int age;
        private int height;

        public Man(int age, int height) {
            this.age = age;
            this.height = height;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            Man man = (Man)super.clone();
            man.age = this.age;
            man.height = this.height;
            return man;
        }

        @Override
        public String toString() {
            return "Man{" + "age=" + age + ", height=" + height + '}';
        }
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        QPrototype prototype = new QPrototype();
        QPrototype copy = (QPrototype)prototype.clone();
        System.out.println(prototype);
        System.out.println(copy);
        copy.getMans()[0].setAge(3);
        System.out.println(prototype);
        System.out.println(copy);
    }
}
