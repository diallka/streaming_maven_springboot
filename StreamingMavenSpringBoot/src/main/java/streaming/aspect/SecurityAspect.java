/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 *
 * @author pro
 */
@Component
@Aspect
public class SecurityAspect {

    @Before("execution(* streaming.dao.*.deleteAll(..))")
    //
    public void exception(JoinPoint jp) {

        throw new RuntimeException(">>> action interdite: " + jp.toString());
    }

}
