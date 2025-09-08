package org.example;

import pattern.behavioral.chainOfResponsibility.DoChainOfResponsibility;
import pattern.behavioral.command.DoCommand;
import pattern.behavioral.interpreter.DoInterpreter;
import pattern.behavioral.iterator.DoIterator;
import pattern.behavioral.mediator.DoMediator;
import pattern.behavioral.memento.DoMemento;
import pattern.behavioral.observer.DoObserver;
import pattern.behavioral.state.DoState;
import pattern.behavioral.strategy.DoStrategy;
import pattern.behavioral.templateMethod.DoTemplateMethod;
import pattern.behavioral.visitor.DoVisitor;
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
//        DoAdaptor doAdaptor = new DoAdaptor();
//        doAdaptor.run();
//
//        DoBridge doBridge = new DoBridge();
//        doBridge.run();
//
//        DoDecorator doDecorator = new DoDecorator();
//        doDecorator.run();
//
//        DoFacade doFacade = new DoFacade();
//        doFacade.run();
//
//        DoProxy doProxy = new DoProxy();
//        doProxy.run();

        /*행동 디자인 패턴*/
//        DoChainOfResponsibility doChainOfResponsibility = new DoChainOfResponsibility();
//        doChainOfResponsibility.run();
//
//        DoCommand doCommand = new DoCommand();
//        doCommand.run();
//
//        DoInterpreter doInterpreter = new DoInterpreter();
//        doInterpreter.run();
//
//        DoIterator doIterator = new DoIterator();
//        doIterator.run();
//
        DoMediator doMediator = new DoMediator();
        doMediator.run();
//
//        DoMemento doMemento = new DoMemento();
//        doMemento.run();
//
//        DoObserver doObserver = new DoObserver();
//        doObserver.run();
//
//        DoState doState = new DoState();
//        doState.run();
//
//        DoStrategy doStrategy = new DoStrategy();
//        doStrategy.run();
//
//        DoVisitor doVisitor = new DoVisitor();
//        doVisitor.run();
//
//        DoTemplateMethod doTemplateMethod = new DoTemplateMethod();
//        doTemplateMethod.run();

    }
}