///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.tink.mpj.app.service;
//
//import com.tink.mpj.business.ejb.MemberFacade;
//import com.tink.mpj.common.logging.Loggable;
//import com.tink.mpj.common.logging.Slogger;
//import com.tink.mpj.common.qualifier.MonitoringLog;
//import com.tink.mpj.persistence.model.Member;
//import java.io.Serializable;
//import javax.inject.Inject;
//import javax.inject.Singleton;
//import org.apache.log4j.Logger;
//
///**
// *
// * @author shearer
// */
//@Loggable
//@Singleton
//public class MemberService{
//    @Inject
//    MemberFacade ejb;
//    
//    // do not use @Inject
//    private Logger logger = Logger.getLogger(MemberService.class); // 通常ログ
//    
//    // do not use @Inject @MonitoringLog
//    private Logger monitoringLog = Logger.getLogger("MonitoryingLog"); // 監視ログ
//    
//    public void insert(Member member){
//        //Call EJB
//        logger.info("[TODO]...call a ejb service]");
//        monitoringLog.warn("This event is being monitored");
//        ejb.create(member); //
//    }
//    
//    public void update(Member member){
//        //TODO
//    }
//
//    public void delete(Member member){
//        //TODO
//    }
//    
//}
