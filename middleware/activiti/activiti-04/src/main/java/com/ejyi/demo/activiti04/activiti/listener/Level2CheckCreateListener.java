package com.ejyi.demo.activiti04.activiti.listener;

import com.ejyi.demo.activiti04.activiti.ActivitiConstants;
import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;

/**
 * @author 余海
 * @version 1.0
 * @description 描述
 * @create 2018-12-05 5:38 PM
 */
public class Level2CheckCreateListener implements TaskListener {

    @Override
    public void notify(DelegateTask delegateTask) {

        System.out.println("Level2CheckCreateListener..task.id:"+ delegateTask.getId()+";task.name:"+
                delegateTask.getName()+";task.assignee:"+delegateTask.getAssignee());


        String adminUserId = delegateTask.getVariable(ActivitiConstants.adminUserId).toString();
        System.out.println("adminUserId:"+adminUserId);
        if("1".equals(adminUserId)){
            delegateTask.setAssignee("4");
            delegateTask.setVariable(ActivitiConstants.checkUsers, delegateTask.getVariable(ActivitiConstants.checkUsers).toString()+","+"4");
        }else{
            delegateTask.setAssignee("5");
            delegateTask.setVariable(ActivitiConstants.checkUsers, delegateTask.getVariable(ActivitiConstants.checkUsers).toString()+","+"5");
        }

    }
}
