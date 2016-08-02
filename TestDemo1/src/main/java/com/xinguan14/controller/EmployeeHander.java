package com.xinguan14.controller;


import com.xinguan14.Dao.EmployeeDao;
import com.xinguan14.entity.Employee;
import com.xinguan14.zidingyiProperties.BlogProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Map;

/**
 * Created by XL on 2016/7/20.
 */
@Controller
@EnableAutoConfiguration
public class EmployeeHander {
    @Autowired
    private EmployeeDao employeeDao;

//    @Autowired
//    private DepartmentDao departmentDao;
//    @RequestMapping(value ="/input",method = RequestMethod.GET)
//    public String input(Map<String,Object> map){
//        map.put("departments",departmentDao.getDepartments());
//        map.put("employee",new Employee());
//        return "input";
//    }
@Autowired
private  BlogProperties blogProperties;
    @RequestMapping("/listAll")
    public  String listAll(Map<String,Object> map){
        map.put("employees",employeeDao.getAll());
        map.put("message","Welcome to spring boot");
         map.put("name",blogProperties.getName());
        map.put("title",blogProperties.getTitle());
        map.put("result",blogProperties.getResult());
        return "listAll";
    }
   @ResponseBody
    @RequestMapping("/testResponseBody")
    public Collection<Employee> testResponseBody(){
        return  employeeDao.getAll();
    }

//注意注意DELETE、PUT请求！！！
    @RequestMapping(value = "/delete",method = RequestMethod.DELETE)
    public  String delete(@RequestParam("id") Integer id){
        employeeDao.delete(id);
        return  "redirect:/listAll";
    }



//    @RequestMapping(value = "/edit/{id}",method = RequestMethod.GET)
//    public String edit(@PathVariable("id") Integer id, Map<String,Object> map){
////        用于回显的
//        map.put("employee",employeeDao.get(id));
//        map.put("departments",departmentDao.getDepartments());
//     return "input";
//    }
//    @ModelAttribute
//    public void getEmployee(@RequestParam(value = "id",required = false) Integer id , Map<String,Object> map){
//        if (id !=null){
//            map.put("employee",employeeDao.get(id));
//        }
//    }
//    @RequestMapping(value = "/add",method = RequestMethod.PUT)
//    public String update(Employee employee){
//        employeeDao.save(employee);
//        return "redirect:/listAll";
//    }
//    可以用于转换角色
//    @InitBinder
//    public  void initBinder(WebDataBinder binder){
//        binder.setDisallowedFields("lastName");
//    }
//@ExceptionHandler({ArithmeticException.class})
//    public ModelAndView handleArithmeticException(Exception ex){
//    ModelAndView mv = new ModelAndView("listAll");
//    mv.addObject("exception",ex);
//         return mv;
//}
//@RequestMapping("/testExceptionHandlerExceptionResolver")
//    public String testExceptionHandlerExceptionResolver(@RequestParam("i") int i){
//    System.out.println("result"+(10/i));
//        return "listAll";
//
//    }
//    @RequestMapping("testAjax")
//    public void ajax(String name, HttpServletResponse response){
//        String result = "你好"+name;
//        response.setContentType("text/html;charset=UTF-8");
//        response.setCharacterEncoding("UTF-8");
//        try {
//
//            response.getWriter().write(result);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }

}
