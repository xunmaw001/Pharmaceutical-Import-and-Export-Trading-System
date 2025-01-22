import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import xiaoshoudingdan from '@/views/modules/xiaoshoudingdan/list'
    import yaopinruku from '@/views/modules/yaopinruku/list'
    import yaopinxinxi from '@/views/modules/yaopinxinxi/list'
    import kehudingdan from '@/views/modules/kehudingdan/list'
    import yewubumen from '@/views/modules/yewubumen/list'
    import yaopinchuku from '@/views/modules/yaopinchuku/list'
    import tuihuodingdan from '@/views/modules/tuihuodingdan/list'
    import caiwubu from '@/views/modules/caiwubu/list'
    import caigoudingdan from '@/views/modules/caigoudingdan/list'
    import kehu from '@/views/modules/kehu/list'
    import gongyingbumen from '@/views/modules/gongyingbumen/list'
    import cangchubumen from '@/views/modules/cangchubumen/list'
    import guoqiyaopin from '@/views/modules/guoqiyaopin/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/xiaoshoudingdan',
        name: '销售订单',
        component: xiaoshoudingdan
      }
      ,{
	path: '/yaopinruku',
        name: '药品入库',
        component: yaopinruku
      }
      ,{
	path: '/yaopinxinxi',
        name: '药品信息',
        component: yaopinxinxi
      }
      ,{
	path: '/kehudingdan',
        name: '客户订单',
        component: kehudingdan
      }
      ,{
	path: '/yewubumen',
        name: '业务部门',
        component: yewubumen
      }
      ,{
	path: '/yaopinchuku',
        name: '药品出库',
        component: yaopinchuku
      }
      ,{
	path: '/tuihuodingdan',
        name: '退货订单',
        component: tuihuodingdan
      }
      ,{
	path: '/caiwubu',
        name: '财务部',
        component: caiwubu
      }
      ,{
	path: '/caigoudingdan',
        name: '采购订单',
        component: caigoudingdan
      }
      ,{
	path: '/kehu',
        name: '客户',
        component: kehu
      }
      ,{
	path: '/gongyingbumen',
        name: '供应部门',
        component: gongyingbumen
      }
      ,{
	path: '/cangchubumen',
        name: '仓储部门',
        component: cangchubumen
      }
      ,{
	path: '/guoqiyaopin',
        name: '过期药品',
        component: guoqiyaopin
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
