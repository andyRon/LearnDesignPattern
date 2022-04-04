package com.andyron.c03prototype;

public class EnemyPlane implements Cloneable{
    private int x;
    private int y = 0;
    private Bullet bullet = new Bullet();

    public EnemyPlane(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void fly() {
        y++;
    }
    // 此处开发setX，是为了让克隆后的实例重新修改横坐标
    public void setX(int x) {
        this.x = x;
    }

    public Bullet getBullet() {
        return bullet;
    }

    public void setBullet(Bullet bullet) {
        this.bullet = bullet;
    }

    @Override
    protected EnemyPlane clone() throws CloneNotSupportedException {
        // 克隆出敌机
        EnemyPlane clonePlane = (EnemyPlane) super.clone();
        // 对子弹进行深拷贝
        clonePlane.setBullet(this.bullet.clone());

        return clonePlane;
    }
}
