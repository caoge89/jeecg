package org.apache.jsp.webpage.main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class hplus_005fmain_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/context/mytags.jsp");
    _jspx_dependants.add("/context/layui.jsp");
    _jspx_dependants.add("/WEB-INF/tld/easyui.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fmenu_0026_005fstyle_005fmenuFun_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fmenu_0026_005fstyle_005fmenuFun_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fmenu_0026_005fstyle_005fmenuFun_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;

      out.write('\n');
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /context/mytags.jsp(9,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("webRoot");
      // /context/mytags.jsp(9,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(basePath);
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta name=\"renderer\" content=\"webkit\">\n");
      out.write("\n");
      out.write("    <title>");
      if (_jspx_meth_t_005fmutiLang_005f0(_jspx_page_context))
        return;
      out.write("</title>\n");
      out.write("\n");
      out.write("    <meta name=\"keywords\" content=\"JEECG,后台bootstrap框架,会员中心主题,后台HTML,响应式后台\">\n");
      out.write("    <meta name=\"description\" content=\"JEECG是一个完全响应式，基于Bootstrap3最新版本开发的扁平化主题，她采用了主流的左右两栏式布局，使用了Html5+CSS3等现代技术\">\n");
      out.write("\n");
      out.write("    <link rel=\"shortcut icon\" href=\"images/favicon.ico\">\n");
      out.write("    <link href=\"plug-in-ui/hplus/css/bootstrap.min.css?v=3.3.6\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"plug-in-ui/hplus/css/font-awesome.min.css?v=4.4.0\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"plug-in/ace/assets/css/font-awesome.min.css\" />\n");
      out.write("    <!--[if IE 7]>\n");
      out.write("    <link rel=\"stylesheet\" href=\"plug-in/ace/assets/css/font-awesome-ie7.min.css\" />\n");
      out.write("    <![endif]-->\n");
      out.write("    <!-- Sweet Alert -->\n");
      out.write("    <link href=\"plug-in-ui/hplus/css/plugins/sweetalert/sweetalert.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"plug-in-ui/hplus/css/animate.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"plug-in-ui/hplus/css/style.css?v=4.1.0\" rel=\"stylesheet\">\n");
      out.write("    <!--右键菜单-->\n");
      out.write("    <link href=\"plug-in/hplus/smartMenu.css\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"fixed-sidebar full-height-layout gray-bg\" style=\"overflow:hidden\">\n");
      out.write("<div id=\"wrapper\">\n");
      out.write("    <!--左侧导航开始-->\n");
      out.write("    <nav class=\"navbar-default navbar-static-side\" role=\"navigation\" style=\"z-index: 1991;\">\n");
      out.write("        <div class=\"nav-close\"><i class=\"fa fa-times-circle\"></i>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"sidebar-collapse\">\n");
      out.write("            <ul class=\"nav\" id=\"side-menu\">\n");
      out.write("                <li class=\"nav-header\">\n");
      out.write("                    <div class=\"dropdown profile-element\">\n");
      out.write("                        <span><img alt=\"image\" class=\"img-circle\" src=\"plug-in/login/images/jeecg-aceplus.png\" /></span>\n");
      out.write("                        ");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"logo-element\">JEECG\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("                ");
      if (_jspx_meth_t_005fmenu_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("    <!--左侧导航结束-->\n");
      out.write("    <!--右侧部分开始-->\n");
      out.write("    <div id=\"page-wrapper\" class=\"gray-bg dashbard-1\">\n");
      out.write("        <div class=\"row border-bottom\">\n");
      out.write("            <nav class=\"navbar navbar-static-top\" role=\"navigation\" style=\"margin-bottom: 0\">\n");
      out.write("                <div class=\"navbar-header\" style=\"height: 60px;\"><a class=\"navbar-minimalize minimalize-styl-2 btn btn-primary \" href=\"#\"><i class=\"fa fa-bars\"></i> </a>\n");
      out.write("                    <form role=\"search\" class=\"navbar-form-custom\" method=\"post\" action=\"search_results.html\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input type=\"text\" placeholder=\"欢迎使用Jeecg快速开发平台 …\" class=\"form-control\" name=\"top-search\" id=\"top-search\">\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <ul class=\"nav navbar-top-links navbar-right\">\n");
      out.write("                   ");
      out.write("\n");
      out.write("                    \n");
      out.write("                    <li class=\"dropdown\" onfocus=\"bindFrameClick()\">\n");
      out.write("                    \t<a class=\"dropdown-toggle count-info\" data-toggle=\"dropdown\" href=\"#\">\n");
      out.write("                                <span ><strong class=\"font-bold\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userName }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</strong></span>\n");
      out.write("                                <span >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${roleName }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("<b class=\"caret\"></b></span>\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"dropdown-menu dropdown-alerts\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"javascript:add('");
      if (_jspx_meth_t_005fmutiLang_005f1(_jspx_page_context))
        return;
      out.write("','userController.do?changepassword','',550,200)\">\n");
      out.write("                                    ");
      if (_jspx_meth_t_005fmutiLang_005f2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"javascript:openwindow('");
      if (_jspx_meth_t_005fmutiLang_005f3(_jspx_page_context))
        return;
      out.write("','userController.do?userinfo')\">");
      if (_jspx_meth_t_005fmutiLang_005f4(_jspx_page_context))
        return;
      out.write("</a></li>\n");
      out.write("                            <li><a href=\"javascript:openwindow('");
      if (_jspx_meth_t_005fmutiLang_005f5(_jspx_page_context))
        return;
      out.write("','tSSmsController.do?getSysInfos')\">");
      if (_jspx_meth_t_005fmutiLang_005f6(_jspx_page_context))
        return;
      out.write("</a></li>\n");
      out.write("                            <li><a href=\"javascript:add('");
      if (_jspx_meth_t_005fmutiLang_005f7(_jspx_page_context))
        return;
      out.write("','userController.do?changestyle','',550,250)\">");
      if (_jspx_meth_t_005fmutiLang_005f8(_jspx_page_context))
        return;
      out.write("</a></li>\n");
      out.write("                            <li><a href=\"javascript:clearLocalstorage()\">");
      if (_jspx_meth_t_005fmutiLang_005f9(_jspx_page_context))
        return;
      out.write("</a></li>\n");
      out.write("                            <li><a href=\"javascript:toJeecgYun()\">云应用中心</a></li>\n");
      out.write("                            <!-- <li><a href=\"http://yun.jeecg.org\" target=\"_blank\">云应用中心</li> -->\n");
      out.write("                           <!--  <li class=\"divider\"></li>\n");
      out.write("                            <li><a href=\"javascript:logout()\">注销</a></li> -->\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                     \n");
      out.write("                    <li class=\"dropdown hidden-xs\">\n");
      out.write("                        <a class=\"right-sidebar-toggle\" aria-expanded=\"false\">\n");
      out.write("                            <i class=\"fa fa-tasks\"></i> 主题\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                      <li class=\"dropdown\">\n");
      out.write("                     <a href=\"javascript:logout()\" class=\"roll-nav roll-right J_tabExit\"><i class=\"fa fa fa-sign-out\"></i> 退出</a>\n");
      out.write("                     </li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row content-tabs\">\n");
      out.write("            <button class=\"roll-nav roll-left J_tabLeft\"><i class=\"fa fa-backward\"></i>\n");
      out.write("            </button>\n");
      out.write("            <nav class=\"page-tabs J_menuTabs\">\n");
      out.write("                <div class=\"page-tabs-content\">\n");
      out.write("                    <a href=\"javascript:;\" class=\"active J_menuTab\" data-id=\"loginController.do?hplushome\">首页</a>\n");
      out.write("                </div>\n");
      out.write("            <button class=\"roll-nav roll-right J_tabRight\"><i class=\"fa fa-forward\"></i>\n");
      out.write("            </button>\n");
      out.write("            <div class=\"btn-group roll-nav roll-right\">\n");
      out.write("                <button class=\"dropdown J_tabClose\" data-toggle=\"dropdown\">关闭操作<span class=\"caret\"></span>\n");
      out.write("\n");
      out.write("                </button>\n");
      out.write("                <ul role=\"menu\" class=\"dropdown-menu dropdown-menu-right\">\n");
      out.write("                    <li class=\"J_tabShowActive\"><a>定位当前选项卡</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"divider\"></li>\n");
      out.write("                    <li class=\"J_tabCloseAll\"><a>关闭全部选项卡</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"J_tabCloseOther\"><a>关闭其他选项卡</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <!-- \n");
      out.write("            <a href=\"javascript:logout()\" class=\"roll-nav roll-right J_tabExit\"><i class=\"fa fa fa-sign-out\"></i> 退出</a>\n");
      out.write("             -->\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row J_mainContent\" id=\"content-main\" style=\"margin-left:-13px;\">\n");
      out.write("            <iframe class=\"J_iframe\" name=\"iframe0\" width=\"100%\" height=\"100%\" src=\"loginController.do?hplushome\" frameborder=\"0\" data-id=\"loginController.do?hplushome\" seamless></iframe>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"footer\">\n");
      out.write("            <div class=\"pull-right\">&copy; ");
      if (_jspx_meth_t_005fmutiLang_005f10(_jspx_page_context))
        return;
      out.write(" <a href=\"http://www.jeecg.org/\" target=\"_blank\">jeecg</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!--右侧部分结束-->\n");
      out.write("    <!--右侧边栏开始-->\n");
      out.write("    <div id=\"right-sidebar\">\n");
      out.write("        <div class=\"sidebar-container\">\n");
      out.write("\n");
      out.write("            <ul class=\"nav nav-tabs navs-3\">\n");
      out.write("\n");
      out.write("                <li class=\"active\">\n");
      out.write("                    <a data-toggle=\"tab\" href=\"#tab-1\">\n");
      out.write("                        <i class=\"fa fa-gear\"></i> 主题\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("               <li class=\"\"><a data-toggle=\"tab\" href=\"#tab-2\">\n");
      out.write("                   <i class=\"fa fa-comments-o\" aria-hidden=\"true\"></i>通知\n");
      out.write("                </a>\n");
      out.write("                </li>\n");
      out.write("                <li><a data-toggle=\"tab\" href=\"#tab-3\">\n");
      out.write("                    <i class=\"fa fa-info-circle\" aria-hidden=\"true\"></i>公告\n");
      out.write("                </a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("            <div class=\"tab-content\">\n");
      out.write("                <div id=\"tab-1\" class=\"tab-pane active\">\n");
      out.write("                    <div class=\"sidebar-title\">\n");
      out.write("                        <h3> <i class=\"fa fa-comments-o\"></i> 主题设置</h3>\n");
      out.write("                        <small><i class=\"fa fa-tim\"></i> 你可以从这里选择和预览主题的布局和样式，这些设置会被保存在本地，下次打开的时候会直接应用这些设置。</small>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"skin-setttings\">\n");
      out.write("                        <div class=\"title\">主题设置</div>\n");
      out.write("                        <div class=\"setings-item\">\n");
      out.write("                            <span>收起左侧菜单</span>\n");
      out.write("                            <div class=\"switch\">\n");
      out.write("                                <div class=\"onoffswitch\">\n");
      out.write("                                    <input type=\"checkbox\" name=\"collapsemenu\" class=\"onoffswitch-checkbox\" id=\"collapsemenu\">\n");
      out.write("                                    <label class=\"onoffswitch-label\" for=\"collapsemenu\">\n");
      out.write("                                        <span class=\"onoffswitch-inner\"></span>\n");
      out.write("                                        <span class=\"onoffswitch-switch\"></span>\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"setings-item\">\n");
      out.write("                            <span>固定顶部</span>\n");
      out.write("\n");
      out.write("                            <div class=\"switch\">\n");
      out.write("                                <div class=\"onoffswitch\">\n");
      out.write("                                    <input type=\"checkbox\" name=\"fixednavbar\" class=\"onoffswitch-checkbox\" id=\"fixednavbar\">\n");
      out.write("                                    <label class=\"onoffswitch-label\" for=\"fixednavbar\">\n");
      out.write("                                        <span class=\"onoffswitch-inner\"></span>\n");
      out.write("                                        <span class=\"onoffswitch-switch\"></span>\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"setings-item\">\n");
      out.write("                                <span>\n");
      out.write("                        固定宽度\n");
      out.write("                    </span>\n");
      out.write("\n");
      out.write("                            <div class=\"switch\">\n");
      out.write("                                <div class=\"onoffswitch\">\n");
      out.write("                                    <input type=\"checkbox\" name=\"boxedlayout\" class=\"onoffswitch-checkbox\" id=\"boxedlayout\">\n");
      out.write("                                    <label class=\"onoffswitch-label\" for=\"boxedlayout\">\n");
      out.write("                                        <span class=\"onoffswitch-inner\"></span>\n");
      out.write("                                        <span class=\"onoffswitch-switch\"></span>\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"title\">皮肤选择</div>\n");
      out.write("                        <div class=\"setings-item default-skin nb\">\n");
      out.write("                                <span class=\"skin-name \">\n");
      out.write("                         <a href=\"#\" class=\"s-skin-0\">\n");
      out.write("                             默认皮肤\n");
      out.write("                         </a>\n");
      out.write("                    </span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"setings-item blue-skin nb\">\n");
      out.write("                                <span class=\"skin-name \">\n");
      out.write("                        <a href=\"#\" class=\"s-skin-1\">\n");
      out.write("                            蓝色主题\n");
      out.write("                        </a>\n");
      out.write("                    </span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"setings-item yellow-skin nb\">\n");
      out.write("                                <span class=\"skin-name \">\n");
      out.write("                        <a href=\"#\" class=\"s-skin-3\">\n");
      out.write("                            黄色/紫色主题\n");
      out.write("                        </a>\n");
      out.write("                    </span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"tab-2\" class=\"tab-pane\">\n");
      out.write("                    <div class=\"sidebar-title\">\n");
      out.write("                        <h3> <i class=\"fa fa-comments-o\"></i> 最新通知<small id=\"messageCount\"><i class=\"fa fa-tim\"></i> 您当前有0条未读通知</small></h3>\n");
      out.write("                    </div>\n");
      out.write("                    <ul class=\"sidebar-list\">\n");
      out.write("                        <li id=\"messageContent\">\n");
      out.write("\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"javascript:goAllMessage();\" id=\"messageFooter\">\n");
      out.write("                                查看全部\n");
      out.write("                                <i class=\"icon-arrow-right\"></i>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"tab-3\" class=\"tab-pane\">\n");
      out.write("                    <div class=\"sidebar-title\">\n");
      out.write("                        <h3> <i class=\"fa fa-cube\"></i> 最新公告<small id=\"noticeCount\"><i class=\"fa fa-tim\"></i> 您当前有0个公告</small></h3>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <ul class=\"sidebar-list\">\n");
      out.write("                        <li id=\"noticeContent\">\n");
      out.write("\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"javascript:goAllNotice();\" id=\"noticeFooter\">\n");
      out.write("                                查看所有公告\n");
      out.write("                                <i class=\"icon-arrow-right\"></i>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!--右侧边栏结束-->\n");
      out.write("    <!--mini聊天窗口开始-->\n");
      out.write("    ");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("    <!--mini聊天窗口结束-->\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- 全局js -->\n");
      out.write("<script src=\"plug-in-ui/hplus/js/jquery.min.js?v=2.1.4\"></script>\n");
      out.write("<script src=\"plug-in-ui/hplus/js/bootstrap.min.js?v=3.3.6\"></script>\n");
      out.write("<script src=\"plug-in-ui/hplus/js/plugins/metisMenu/jquery.metisMenu.js\"></script>\n");
      out.write("<script src=\"plug-in-ui/hplus/js/plugins/slimscroll/jquery.slimscroll.min.js\"></script>\n");
      out.write("<script src=\"plug-in-ui/hplus/js/plugins/layer/layer.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- 自定义js -->\n");
      out.write("<script src=\"plug-in-ui/hplus/js/hplus.js?v=4.1.0\"></script>\n");
      out.write("<!--右键菜单-->\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/hplus/jquery-smartMenu.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/hplus/contabs.js\"></script>\n");
      if (_jspx_meth_t_005fbase_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<!-- 第三方插件 -->\n");
      out.write("<script src=\"plug-in-ui/hplus/js/plugins/pace/pace.min.js\"></script>\n");
      out.write("<!-- Sweet alert -->\n");
      out.write("<script src=\"plug-in-ui/hplus/js/plugins/sweetalert/sweetalert.min.js\"></script>\n");
      out.write("<script src=\"plug-in/jquery-plugs/storage/jquery.storageapi.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- 弹出TAB -->\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/hplus/hplus-tab.js\"></script>\n");
      out.write("<!-- 在线聊天 -->\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"content/chat/layui/css/layui.css\">\n");
      out.write("<script src=\"content/chat/layui/layui.js\"></script>\n");
      out.write("<script src=\"plug-in/layim/config.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    function logout(){\n");
      out.write("        /*bootbox.confirm(\"");
      if (_jspx_meth_t_005fmutiLang_005f11(_jspx_page_context))
        return;
      out.write("\", function(result) {\n");
      out.write("            if(result)\n");
      out.write("                location.href=\"loginController.do?logout\";\n");
      out.write("        });*/\n");
      out.write("        /*swal({\n");
      out.write("            title: \"您确定要注销吗？\",\n");
      out.write("            text: \"注销后需要重新登录！\",\n");
      out.write("            type: \"warning\",\n");
      out.write("            showCancelButton: true,\n");
      out.write("            confirmButtonColor: \"#DD6B55\",\n");
      out.write("            confirmButtonText: \"确定\",\n");
      out.write("            cancelButtonText: \"取消\",\n");
      out.write("            closeOnConfirm: false,\n");
      out.write("            closeOnCancel: true\n");
      out.write("        },\n");
      out.write("        function (isConfirm) {\n");
      out.write("            if (isConfirm) {\n");
      out.write("                //swal(\"注销成功！\", \"您已经成功注销。\", \"success\");\n");
      out.write("                location.href=\"loginController.do?logout\";\n");
      out.write("            } else {\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("        });*/\n");
      out.write("        layer.confirm('您确定要注销吗？', {\n");
      out.write("            btn: ['确定','取消'], //按钮\n");
      out.write("            shade: false //不显示遮罩\n");
      out.write("        }, function(){\n");
      out.write("            location.href=\"loginController.do?logout\";\n");
      out.write("        }, function(){\n");
      out.write("            return;\n");
      out.write("        });\n");
      out.write("    }\n");
      out.write("    function clearLocalstorage(){\n");
      out.write("        var storage=$.localStorage;\n");
      out.write("        if(!storage)\n");
      out.write("            storage=$.cookieStorage;\n");
      out.write("        storage.removeAll();\n");
      out.write("        //bootbox.alert( \"浏览器缓存清除成功!\");\n");
      out.write("        layer.msg(\"浏览器缓存清除成功!\");\n");
      out.write("    }\n");
      out.write("    function toJeecgYun(){\n");
      out.write("    \twindow.open(\"http://yun.jeecg.org\",\"_blank\");\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    $(document).ready(function(){\n");
      out.write("        //加载公告\n");
      out.write("        var url = \"noticeController.do?getNoticeList\";\n");
      out.write("        jQuery.ajax({\n");
      out.write("            url:url,\n");
      out.write("            type:\"GET\",\n");
      out.write("            dataType:\"JSON\",\n");
      out.write("            async: false,\n");
      out.write("            success:function(data){\n");
      out.write("                if(data.success){\n");
      out.write("                    var noticeList = data.attributes.noticeList;\n");
      out.write("                    var noticeCount = data.obj;\n");
      out.write("                    //加载公告条数\n");
      out.write("                    if(noticeCount>99){\n");
      out.write("                        $(\"#noticeCount\").html(\"99+\");\n");
      out.write("                    }else{\n");
      out.write("                        $(\"#noticeCount\").html(noticeCount);\n");
      out.write("                    }\n");
      out.write("                    //加载公告提示\n");
      out.write("                    var noticeTip = \"\";\n");
      out.write("                    noticeTip += \"<i class='icon-warning-sign'></i>\";\n");
      out.write("                    noticeTip += noticeCount+\" \"+data.attributes.tip;\n");
      out.write("                    $(\"#noticeTip\").html(noticeTip);\n");
      out.write("\n");
      out.write("                    //加载公告条目\n");
      out.write("                    var noticeContent = \"\";\n");
      out.write("                    if(noticeList.length > 0){\n");
      out.write("                        for(var i=0;i<noticeList.length;i++){\n");
      out.write("                            noticeContent +=\"<li><a href='javascript:goNotice(&quot;\"+noticeList[i].id+\"&quot;)' \";\n");
      out.write("                            noticeContent +=\"style='word-break:keep-all;white-space:nowrap;overflow:hidden;text-overflow:ellipsis;'>\";\n");
      out.write("                            noticeContent +=\"<i class='btn btn-xs btn-primary fa fa-user'></i>\";\n");
      out.write("                            noticeContent +=\"&nbsp;\"+noticeList[i].noticeTitle + \"</a></li></ul></li>\";\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                    //alert(noticeContent);\n");
      out.write("                    $(\"#noticeContent\").html(noticeContent);\n");
      out.write("\n");
      out.write("                    //加载公告底部文字\n");
      out.write("                    var noticeSeeAll = data.attributes.seeAll +\"<i class='ace-icon fa fa-arrow-right'></i>\";\n");
      out.write("                    $(\"#noticeFooter\").html(noticeSeeAll);\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("\n");
      out.write("\n");
      out.write("        //加载消息\n");
      out.write("        var url = \"tSSmsController.do?getMessageList\";\n");
      out.write("        $.ajax({\n");
      out.write("            url:url,\n");
      out.write("            type:\"GET\",\n");
      out.write("            dataType:\"JSON\",\n");
      out.write("            async: false,\n");
      out.write("            success:function(data){\n");
      out.write("                if(data.success){\n");
      out.write("                    var messageList = data.attributes.messageList;\n");
      out.write("                    var messageCount = data.obj;\n");
      out.write("                    //加载消息条数\n");
      out.write("                    if(messageCount>99){\n");
      out.write("                        $(\"#messageCount\").html(\"99+\");\n");
      out.write("                    }else{\n");
      out.write("                        $(\"#messageCount\").html(messageCount);\n");
      out.write("                    }\n");
      out.write("                    //加载消息tip提示\n");
      out.write("                    var messageTip = \"\";\n");
      out.write("                    messageTip += \"<i class='ace-icon fa fa-envelope-o'></i>\";\n");
      out.write("                    messageTip += messageCount+\" \"+data.attributes.tip;\n");
      out.write("                    $(\"#messageTip\").html(messageTip);\n");
      out.write("\n");
      out.write("                    //加载消息条目（有限）\n");
      out.write("                    var messageContent = \"\";\n");
      out.write("                    if(messageList.length > 0){\n");
      out.write("                        for(var i=0;i<messageList.length;i++){\n");
      out.write("                            messageContent +=\"<li><a href='javascript:goMessage(&quot;\"+messageList[i].id+\"&quot;)' class='clearfix'>\";\n");
      out.write("                            messageContent +=\"<img src='plug-in/ace/avatars/avatar3.png' class='msg-photo' alt='Alex’s Avatar' />\";\n");
      out.write("                            messageContent +=\"<span class='msg-body'><span class='msg-title'>\";\n");
      out.write("                            messageContent +=\"<span class='blue'>\"+messageList[i].esSender+\":</span>\";\n");
      out.write("                            messageContent += messageList[i].esTitle + \"</span>\";\n");
      out.write("                            messageContent +=\"<span class='msg-time'><i class='ace-icon fa fa-clock-o'></i><span>\"+messageList[i].esSendtimeTxt+\"</span></span>\";\n");
      out.write("                            messageContent +=\"</span></a><input id='\"+messageList[i].id+\"_title' type='hidden' value='\"+messageList[i].esTitle+\"'>\";\n");
      out.write("                            messageContent +=\"<input id='\"+messageList[i].id+\"_status' type='hidden' value='\"+messageList[i].esStatus+\"'>\";\n");
      out.write("                            messageContent +=\"<input id='\"+messageList[i].id+\"_content' type='hidden' value='\"+messageList[i].esContent+\"'></li>\";\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                    $(\"#messageContent\").html(messageContent);\n");
      out.write("\n");
      out.write("                    //加载消息底部文字\n");
      out.write("                    var messageSeeAll = data.attributes.seeAll +\"<i class='ace-icon fa fa-arrow-right'></i>\";\n");
      out.write("                    $(\"#messageFooter\").html(messageSeeAll);\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    function goAllNotice(){\n");
      out.write("        var addurl = \"noticeController.do?noticeList\";\n");
      out.write("        createdetailwindow(\"公告\", addurl, 800, 400);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function goNotice(id){\n");
      out.write("        var addurl = \"noticeController.do?goNotice&id=\"+id;\n");
      out.write("        createdetailwindow(\"通知公告详情\", addurl, 750, 600);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function goAllMessage(){\n");
      out.write("        var addurl = \"tSSmsController.do?getSysInfos\";\n");
      out.write("        createdetailwindow(\"通知\", addurl, 800, 400);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function goMessage(id){\n");
      out.write("        var title = $(\"#\"+id+\"_title\").val();\n");
      out.write("        var content = $(\"#\"+id+\"_content\").val();\n");
      out.write("        $(\"#msgId\").val(id);\n");
      out.write("        $(\"#msgTitle\").html(title);\n");
      out.write("        $(\"#msgContent\").html(content);\n");
      out.write("        var status = $(\"#\"+id+\"_status\").val();\n");
      out.write("        if(status==1){\n");
      out.write("            $(\"#msgStatus\").html(\"未读\");\n");
      out.write("        }else{\n");
      out.write("            $(\"#msgStatus\").html(\"已读\");\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        $('.theme-popover-mask').fadeIn(100);\n");
      out.write("        $('.theme-popover').slideDown(200);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function readMessage(){\n");
      out.write("        var msgId = $(\"#msgId\").val();\n");
      out.write("        var url = \"tSSmsController.do?readMessage\";\n");
      out.write("        $.ajax({\n");
      out.write("            url:url,\n");
      out.write("            type:\"GET\",\n");
      out.write("            dataType:\"JSON\",\n");
      out.write("            data:{\n");
      out.write("                messageId:msgId\n");
      out.write("            },\n");
      out.write("            success:function(data){\n");
      out.write("                if(data.success){\n");
      out.write("                    $(\"#msgStatus\").html(\"已读\");\n");
      out.write("                    $(\"#\"+msgId+\"_status\").val('2');\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    //个人信息弹出层回缩\n");
      out.write("    function frameBodyClick(){ \n");
      out.write("\t\t$(\".count-info\").attr(\"aria-expanded\",\"false\").parent().removeClass(\"open\");\n");
      out.write("\t}\n");
      out.write("    //新增iframe中绑定click事件回调父级函数\n");
      out.write("    function bindFrameClick(){\n");
      out.write("    \t$(\".J_iframe\").contents().find(\"body\").attr(\"onclick\", \"parent.frameBodyClick()\"); \n");
      out.write("    }\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_t_005fmutiLang_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f0 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f0.setParent(null);
    // /webpage/main/hplus_main.jsp(17,11) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f0.setLangKey("jeect.platform");
    int _jspx_eval_t_005fmutiLang_005f0 = _jspx_th_t_005fmutiLang_005f0.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f0);
    return false;
  }

  private boolean _jspx_meth_t_005fmenu_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:menu
    org.jeecgframework.tag.core.easyui.MenuTag _jspx_th_t_005fmenu_005f0 = (org.jeecgframework.tag.core.easyui.MenuTag) _005fjspx_005ftagPool_005ft_005fmenu_0026_005fstyle_005fmenuFun_005fnobody.get(org.jeecgframework.tag.core.easyui.MenuTag.class);
    _jspx_th_t_005fmenu_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmenu_005f0.setParent(null);
    // /webpage/main/hplus_main.jsp(75,16) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmenu_005f0.setStyle("hplus");
    // /webpage/main/hplus_main.jsp(75,16) name = menuFun type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmenu_005f0.setMenuFun((java.util.Map) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${menuMap}", java.util.Map.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_t_005fmenu_005f0 = _jspx_th_t_005fmenu_005f0.doStartTag();
    if (_jspx_th_t_005fmenu_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmenu_0026_005fstyle_005fmenuFun_005fnobody.reuse(_jspx_th_t_005fmenu_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmenu_0026_005fstyle_005fmenuFun_005fnobody.reuse(_jspx_th_t_005fmenu_005f0);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f1 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f1.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f1.setParent(null);
    // /webpage/main/hplus_main.jsp(150,57) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f1.setLangKey("common.change.password");
    int _jspx_eval_t_005fmutiLang_005f1 = _jspx_th_t_005fmutiLang_005f1.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f1);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f2 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f2.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f2.setParent(null);
    // /webpage/main/hplus_main.jsp(151,36) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f2.setLangKey("common.change.password");
    int _jspx_eval_t_005fmutiLang_005f2 = _jspx_th_t_005fmutiLang_005f2.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f2);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f3 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f3.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f3.setParent(null);
    // /webpage/main/hplus_main.jsp(154,64) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f3.setLangKey("common.profile");
    int _jspx_eval_t_005fmutiLang_005f3 = _jspx_th_t_005fmutiLang_005f3.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f3);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f4 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f4.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f4.setParent(null);
    // /webpage/main/hplus_main.jsp(154,135) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f4.setLangKey("common.profile");
    int _jspx_eval_t_005fmutiLang_005f4 = _jspx_th_t_005fmutiLang_005f4.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f4);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f5 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f5.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f5.setParent(null);
    // /webpage/main/hplus_main.jsp(155,64) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f5.setLangKey("common.ssms.getSysInfos");
    int _jspx_eval_t_005fmutiLang_005f5 = _jspx_th_t_005fmutiLang_005f5.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f5);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f6 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f6.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f6.setParent(null);
    // /webpage/main/hplus_main.jsp(155,148) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f6.setLangKey("common.ssms.getSysInfos");
    int _jspx_eval_t_005fmutiLang_005f6 = _jspx_th_t_005fmutiLang_005f6.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f6);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f7 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f7.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f7.setParent(null);
    // /webpage/main/hplus_main.jsp(156,57) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f7.setLangKey("common.change.style");
    int _jspx_eval_t_005fmutiLang_005f7 = _jspx_th_t_005fmutiLang_005f7.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f7);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f8 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f8.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f8.setParent(null);
    // /webpage/main/hplus_main.jsp(156,147) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f8.setLangKey("common.my.style");
    int _jspx_eval_t_005fmutiLang_005f8 = _jspx_th_t_005fmutiLang_005f8.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f8);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f9 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f9.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f9.setParent(null);
    // /webpage/main/hplus_main.jsp(157,73) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f9.setLangKey("common.clear.localstorage");
    int _jspx_eval_t_005fmutiLang_005f9 = _jspx_th_t_005fmutiLang_005f9.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f9);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f10 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f10.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f10.setParent(null);
    // /webpage/main/hplus_main.jsp(209,43) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f10.setLangKey("system.version.number");
    int _jspx_eval_t_005fmutiLang_005f10 = _jspx_th_t_005fmutiLang_005f10.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f10);
    return false;
  }

  private boolean _jspx_meth_t_005fbase_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:base
    org.jeecgframework.tag.core.easyui.BaseTag _jspx_th_t_005fbase_005f0 = (org.jeecgframework.tag.core.easyui.BaseTag) _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.get(org.jeecgframework.tag.core.easyui.BaseTag.class);
    _jspx_th_t_005fbase_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fbase_005f0.setParent(null);
    // /webpage/main/hplus_main.jsp(453,0) name = type type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fbase_005f0.setType("tools");
    int _jspx_eval_t_005fbase_005f0 = _jspx_th_t_005fbase_005f0.doStartTag();
    if (_jspx_th_t_005fbase_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.reuse(_jspx_th_t_005fbase_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.reuse(_jspx_th_t_005fbase_005f0);
    return false;
  }

  private boolean _jspx_meth_t_005fmutiLang_005f11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f11 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f11.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f11.setParent(null);
    // /webpage/main/hplus_main.jsp(466,27) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f11.setLangKey("common.exit.confirm");
    int _jspx_eval_t_005fmutiLang_005f11 = _jspx_th_t_005fmutiLang_005f11.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f11);
    return false;
  }
}
