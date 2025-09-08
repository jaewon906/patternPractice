package org.example;

import pattern.creational.abstractFactory.DoAbstractFactory;
import pattern.creational.builder.DoBuild;
import pattern.creational.factory.DoFactory;
import pattern.creational.prototype.DoPrototype;
import pattern.creational.singleton.DoSingleton;
import pattern.structural.adaptor.DoAdaptor;
import pattern.structural.bridge.DoBridge;
import pattern.structural.decorator.DoDecorator;
import pattern.structural.facade.DoFacade;
import pattern.structural.proxy.DoProxy;

public class Main {
    public static void main(String[] args) {
        /*생성 디자인 패턴*/
//        DoAbstractFactory doAbstractFactory = new DoAbstractFactory();
//        doAbstractFactory.run();
//
//        DoFactory doFactory = new DoFactory();
//        doFactory.run();
//
//        DoBuild doBuild = new DoBuild();
//        doBuild.run();
//
//        DoPrototype doPrototype = new DoPrototype();
//        doPrototype.run();
//
//        DoSingleton doSingleton = new DoSingleton();
//        doSingleton.run();

        /*구조 디자인 패턴*/
        DoAdaptor doAdaptor = new DoAdaptor();
        doAdaptor.run();

        DoBridge doBridge = new DoBridge();
        doBridge.run();

        DoDecorator doDecorator = new DoDecorator();
        doDecorator.run();

        DoFacade doFacade = new DoFacade();
        doFacade.run();

        DoProxy doProxy = new DoProxy();
        doProxy.run();
    }
}