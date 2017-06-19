package org.apache.jsp.webpage.system.role;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class roleTree_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/context/mytags.jsp");
    _jspx_dependants.add("/WEB-INF/tld/easyui.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.release();
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
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t$(function() {\n");
      out.write("        // 获取并构建角色Tree：展示角色树并选中当前组织机构所拥有的角色；\n");
      out.write("\t\t$('#orgRoleTree').tree({\n");
      out.write("\t\t\tcheckbox : true,\n");
      out.write("\t\t\turl : 'roleController.do?getRoleTree&orgId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orgId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("',\n");
      out.write("\t\t\tonLoadSuccess : function(node) {\n");
      out.write("\t\t\t\texpandAll();\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t\t$(\"#functionListPanel\").panel(\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\ttitle :'");
      if (_jspx_meth_t_005fmutiLang_005f0(_jspx_page_context))
        return;
      out.write("',\n");
      out.write("\t\t\t\t\ttools:[{iconCls:'icon-save',handler:function(){mysubmit();}}]\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t);\n");
      out.write("\t});\n");
      out.write("\tfunction mysubmit() { // 提交\n");
      out.write("\t\tvar orgId = $(\"#orgId\").val();\n");
      out.write("\t\tvar ids = GetNode();\n");
      out.write("\t\tdoSubmit(\"roleController.do?updateOrgRole&roleIds=\" + ids + \"&orgId=\" + orgId);\n");
      out.write("\t}\n");
      out.write("    /**\n");
      out.write("     * 获取 选中的节点 并返回\n");
      out.write("     * @returns {string} 节点id，多个id已逗号分割\n");
      out.write("     * @constructor\n");
      out.write("     */\n");
      out.write("    function GetNode() {\n");
      out.write("\t\tvar node = $('#orgRoleTree').tree('getChecked');\n");
      out.write("\t\tvar cnodes = '';\n");
      out.write("\t\tvar pnodes = '';\n");
      out.write("\t\tvar pnode = null; //保存上一步所选父节点\n");
      out.write("\t\tfor ( var i = 0; i < node.length; i++) {\n");
      out.write("\t\t\tif ($('#orgRoleTree').tree('isLeaf', node[i].target)) {\n");
      out.write("\t\t\t\tcnodes += node[i].id + ',';\n");
      out.write("\t\t\t\tpnode = $('#orgRoleTree').tree('getParent', node[i].target); //获取当前节点的父节点\n");
      out.write("\t\t\t\twhile (pnode!=null) {//添加全部父节点\n");
      out.write("\t\t\t\t\tpnodes += pnode.id + ',';\n");
      out.write("\t\t\t\t\tpnode = $('#orgRoleTree').tree('getParent', pnode.target); \n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t\tcnodes = cnodes.substring(0, cnodes.length - 1);\n");
      out.write("\t\tpnodes = pnodes.substring(0, pnodes.length - 1);\n");
      out.write("\t\treturn cnodes + \",\" + pnodes;\n");
      out.write("\t}\n");
      out.write("\t/**\n");
      out.write("\t * 展开所有节点\n");
      out.write("     */\n");
      out.write("\tfunction expandAll() {\n");
      out.write("\t\tvar node = $('#orgRoleTree').tree('getSelected');\n");
      out.write("\t\tif (node) {\n");
      out.write("\t\t\t$('#orgRoleTree').tree('expandAll', node.target);\n");
      out.write("\t\t} else {\n");
      out.write("\t\t\t$('#orgRoleTree').tree('expandAll');\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("    /**\n");
      out.write("     * 选择所有节点\n");
      out.write("     */\n");
      out.write("\tfunction selecrAll() {\n");
      out.write("\t\tvar node = $('#orgRoleTree').tree('getRoots');\n");
      out.write("\t\tfor ( var i = 0; i < node.length; i++) {\n");
      out.write("            $('#orgRoleTree').tree(\"check\",node[i].target);\n");
      out.write("\t    }\n");
      out.write("\t}\n");
      out.write("    /**\n");
      out.write("     * 重置树\n");
      out.write("     */\n");
      out.write("\tfunction reset() {\n");
      out.write("\t\t$('#orgRoleTree').tree('reload');\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t$('#selecrAllBtn').linkbutton({\n");
      out.write("\t});\n");
      out.write("\t$('#resetBtn').linkbutton({   \n");
      out.write("\t});   \n");
      out.write("</script>\n");
      out.write("<div class=\"easyui-layout\" fit=\"true\">\n");
      out.write("    <div region=\"center\" style=\"padding:0px;border:0px\">\n");
      out.write("        <div class=\"easyui-panel\" style=\"padding:0px;border:0px\" fit=\"true\" border=\"false\" id=\"functionListPanel\">\n");
      out.write("            <input type=\"hidden\" name=\"orgId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orgId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" id=\"orgId\">\n");
      out.write("            <a id=\"selecrAllBtn\" onclick=\"selecrAll();\">");
      if (_jspx_meth_t_005fmutiLang_005f1(_jspx_page_context))
        return;
      out.write("</a>\n");
      out.write("            <a id=\"resetBtn\" onclick=\"reset();\">");
      if (_jspx_meth_t_005fmutiLang_005f2(_jspx_page_context))
        return;
      out.write("</a>\n");
      out.write("            <ul id=\"orgRoleTree\"></ul>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
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
    // /webpage/system/role/roleTree.jsp(15,13) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f0.setLangKey("common.role.list");
    int _jspx_eval_t_005fmutiLang_005f0 = _jspx_th_t_005fmutiLang_005f0.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f0);
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
    // /webpage/system/role/roleTree.jsp(85,56) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f1.setLangKey("select.all");
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
    // /webpage/system/role/roleTree.jsp(86,48) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f2.setLangKey("common.reset");
    int _jspx_eval_t_005fmutiLang_005f2 = _jspx_th_t_005fmutiLang_005f2.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f2);
    return false;
  }
}
