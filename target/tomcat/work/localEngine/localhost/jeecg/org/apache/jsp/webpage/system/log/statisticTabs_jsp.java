package org.apache.jsp.webpage.system.log;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class statisticTabs_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/context/mytags.jsp");
    _jspx_dependants.add("/WEB-INF/tld/easyui.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005ftabs_0026_005fiframe_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005ftab_0026_005ftitle_005fid_005ficon_005fhref_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005ftabs_0026_005fiframe_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005ftab_0026_005ftitle_005fid_005ficon_005fhref_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005ftabs_0026_005fiframe_005fid.release();
    _005fjspx_005ftagPool_005ft_005ftab_0026_005ftitle_005fid_005ficon_005fhref_005fnobody.release();
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

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
      out.write("<!-- context path -->\n");
      if (_jspx_meth_t_005fbase_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/Highcharts-2.2.5/js/highcharts.src.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/Highcharts-2.2.5/js/modules/exporting.src.js\"></script>\n");
      if (_jspx_meth_t_005ftabs_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t\t$(document).ready(function() {\n");
      out.write("\t\t\t//为不需要打印的元素添加打印隐藏识别类\n");
      out.write("\t\t\t$(\".tabs-header\").addClass(\"no-print\");\n");
      out.write("\t\t})\n");
      out.write("</script>\n");
      out.write("<!-- update-end--Author:xuelin  Date:20170329 for：[#1823]【bug】报表点击打印后，页面乱的问题解决---------------------- -->");
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

  private boolean _jspx_meth_t_005fbase_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:base
    org.jeecgframework.tag.core.easyui.BaseTag _jspx_th_t_005fbase_005f0 = (org.jeecgframework.tag.core.easyui.BaseTag) _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.get(org.jeecgframework.tag.core.easyui.BaseTag.class);
    _jspx_th_t_005fbase_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fbase_005f0.setParent(null);
    // /webpage/system/log/statisticTabs.jsp(4,0) name = type type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fbase_005f0.setType("jquery,easyui");
    int _jspx_eval_t_005fbase_005f0 = _jspx_th_t_005fbase_005f0.doStartTag();
    if (_jspx_th_t_005fbase_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.reuse(_jspx_th_t_005fbase_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.reuse(_jspx_th_t_005fbase_005f0);
    return false;
  }

  private boolean _jspx_meth_t_005ftabs_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:tabs
    org.jeecgframework.tag.core.easyui.TabsTag _jspx_th_t_005ftabs_005f0 = (org.jeecgframework.tag.core.easyui.TabsTag) _005fjspx_005ftagPool_005ft_005ftabs_0026_005fiframe_005fid.get(org.jeecgframework.tag.core.easyui.TabsTag.class);
    _jspx_th_t_005ftabs_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005ftabs_005f0.setParent(null);
    // /webpage/system/log/statisticTabs.jsp(7,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005ftabs_005f0.setId("tt");
    // /webpage/system/log/statisticTabs.jsp(7,0) name = iframe type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005ftabs_005f0.setIframe(false);
    int _jspx_eval_t_005ftabs_005f0 = _jspx_th_t_005ftabs_005f0.doStartTag();
    if (_jspx_eval_t_005ftabs_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_005ftab_005f0(_jspx_th_t_005ftabs_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_005ftab_005f1(_jspx_th_t_005ftabs_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_005ftab_005f2(_jspx_th_t_005ftabs_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        int evalDoAfterBody = _jspx_th_t_005ftabs_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_t_005ftabs_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005ftabs_0026_005fiframe_005fid.reuse(_jspx_th_t_005ftabs_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005ftabs_0026_005fiframe_005fid.reuse(_jspx_th_t_005ftabs_005f0);
    return false;
  }

  private boolean _jspx_meth_t_005ftab_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005ftabs_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:tab
    org.jeecgframework.tag.core.easyui.TabTag _jspx_th_t_005ftab_005f0 = (org.jeecgframework.tag.core.easyui.TabTag) _005fjspx_005ftagPool_005ft_005ftab_0026_005ftitle_005fid_005ficon_005fhref_005fnobody.get(org.jeecgframework.tag.core.easyui.TabTag.class);
    _jspx_th_t_005ftab_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005ftab_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005ftabs_005f0);
    // /webpage/system/log/statisticTabs.jsp(8,1) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005ftab_005f0.setHref("logController.do?userBroswer&reportType=line");
    // /webpage/system/log/statisticTabs.jsp(8,1) name = icon type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005ftab_005f0.setIcon("icon-search");
    // /webpage/system/log/statisticTabs.jsp(8,1) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005ftab_005f0.setTitle("user.analysis.line");
    // /webpage/system/log/statisticTabs.jsp(8,1) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005ftab_005f0.setId("pnode");
    int _jspx_eval_t_005ftab_005f0 = _jspx_th_t_005ftab_005f0.doStartTag();
    if (_jspx_th_t_005ftab_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005ftab_0026_005ftitle_005fid_005ficon_005fhref_005fnobody.reuse(_jspx_th_t_005ftab_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005ftab_0026_005ftitle_005fid_005ficon_005fhref_005fnobody.reuse(_jspx_th_t_005ftab_005f0);
    return false;
  }

  private boolean _jspx_meth_t_005ftab_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005ftabs_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:tab
    org.jeecgframework.tag.core.easyui.TabTag _jspx_th_t_005ftab_005f1 = (org.jeecgframework.tag.core.easyui.TabTag) _005fjspx_005ftagPool_005ft_005ftab_0026_005ftitle_005fid_005ficon_005fhref_005fnobody.get(org.jeecgframework.tag.core.easyui.TabTag.class);
    _jspx_th_t_005ftab_005f1.setPageContext(_jspx_page_context);
    _jspx_th_t_005ftab_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005ftabs_005f0);
    // /webpage/system/log/statisticTabs.jsp(9,1) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005ftab_005f1.setHref("logController.do?userBroswer&reportType=pie");
    // /webpage/system/log/statisticTabs.jsp(9,1) name = icon type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005ftab_005f1.setIcon("icon-search");
    // /webpage/system/log/statisticTabs.jsp(9,1) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005ftab_005f1.setTitle("user.analysis.pie");
    // /webpage/system/log/statisticTabs.jsp(9,1) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005ftab_005f1.setId("pnode");
    int _jspx_eval_t_005ftab_005f1 = _jspx_th_t_005ftab_005f1.doStartTag();
    if (_jspx_th_t_005ftab_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005ftab_0026_005ftitle_005fid_005ficon_005fhref_005fnobody.reuse(_jspx_th_t_005ftab_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005ftab_0026_005ftitle_005fid_005ficon_005fhref_005fnobody.reuse(_jspx_th_t_005ftab_005f1);
    return false;
  }

  private boolean _jspx_meth_t_005ftab_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005ftabs_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:tab
    org.jeecgframework.tag.core.easyui.TabTag _jspx_th_t_005ftab_005f2 = (org.jeecgframework.tag.core.easyui.TabTag) _005fjspx_005ftagPool_005ft_005ftab_0026_005ftitle_005fid_005ficon_005fhref_005fnobody.get(org.jeecgframework.tag.core.easyui.TabTag.class);
    _jspx_th_t_005ftab_005f2.setPageContext(_jspx_page_context);
    _jspx_th_t_005ftab_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005ftabs_005f0);
    // /webpage/system/log/statisticTabs.jsp(10,1) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005ftab_005f2.setHref("logController.do?userBroswer&reportType=column");
    // /webpage/system/log/statisticTabs.jsp(10,1) name = icon type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005ftab_005f2.setIcon("icon-search");
    // /webpage/system/log/statisticTabs.jsp(10,1) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005ftab_005f2.setTitle("user.analysis.histogram");
    // /webpage/system/log/statisticTabs.jsp(10,1) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005ftab_005f2.setId("pnode");
    int _jspx_eval_t_005ftab_005f2 = _jspx_th_t_005ftab_005f2.doStartTag();
    if (_jspx_th_t_005ftab_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005ftab_0026_005ftitle_005fid_005ficon_005fhref_005fnobody.reuse(_jspx_th_t_005ftab_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005ftab_0026_005ftitle_005fid_005ficon_005fhref_005fnobody.reuse(_jspx_th_t_005ftab_005f2);
    return false;
  }
}
