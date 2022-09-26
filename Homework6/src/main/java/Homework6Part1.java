


import com.sun.source.tree.ReturnTree;

import java.nio.file.DirectoryStream;
import java.util.*;


class Notebook{

    private int ram;
    private int ssd;
    private int cpu;
    private String OS;
    private String collor;

    public Notebook() {
    }

    public Notebook(int ram, int ssd, int cpu, String OS, String collor) {
        this.ram = ram;
        this.ssd = ssd;
        this.cpu = cpu;
        this.OS = OS;
        this.collor = collor;
    }

    @Override
    public String  toString() {
        return "Notebook{" +
                "ram=" + ram +
                ", ssd=" + ssd +
                ", cpu=" + cpu +
                ", OS='" + OS + '\'' +
                ", collor='" + collor + '\'' +
                '}';
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getCollor() {
        return collor;
    }

    public void setCollor(String collor) {
        this.collor = collor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return ram == notebook.ram && ssd == notebook.ssd && cpu == notebook.cpu && Objects.equals(OS, notebook.OS)
                && Objects.equals(collor, notebook.collor);
    }

    public static Set Filter(Set<Notebook> notebookSet) {
        Set<Notebook> filtered = new HashSet<>();
        Notebook system = new Notebook();
        system = GetSystem();
        System.out.println("System " + system);
        for (Notebook c: notebookSet){
            if (system.collor.equals(c.collor) &&
            system.OS.equals(c.OS) &&
            (system.ram <= c.ram || system.ram == 0) &&
            (system.cpu <= c.cpu || system.cpu == 0) &&
            (system.ssd <= c.ssd || system.ssd == 0))
                filtered.add(c);
        }
        return filtered;
    }

    public static Notebook GetSystem(){
        Notebook system = new Notebook();
        Scanner scanner = new Scanner(System.in);
        System.out.println("ram: ");
        system.setRam(scanner.nextInt());
        System.out.println("ssd: ");
        system.setSsd(scanner.nextInt());
        System.out.println("cpu: ");
        system.setCpu(scanner.nextInt());
        System.out.println("OS: ");
        system.setOS(scanner.next());
        System.out.println("Collor: ");
        system.setCollor(scanner.next());
        return system;
    }
    @Override
    public int hashCode() {
        return Objects.hash(ram, ssd, cpu, OS, collor);
    }



    public static void main(String[] args) {
        Set<Notebook> notebookSet = new HashSet<>();
        notebookSet.add(new Notebook());
        notebookSet.add(new Notebook(8, 512, 4, "win", "black"));
        notebookSet.add(new Notebook(4, 1024, 3, "Linux", "gray"));
        for (Notebook c : notebookSet){
            System.out.println(c);
        }
        Set<Notebook> filtered = new HashSet<>();
        filtered = Filter(notebookSet);
        System.out.println(filtered);

    }
}
/*
    Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
    Создать множество ноутбуков.

    Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
    отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
    “Введите цифру, соответствующую необходимому критерию:
    1 - ОЗУ
    2 - Объем ЖД
    3 - Операционная система
    4 - Цвет …
    Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
    Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */