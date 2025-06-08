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
    import news from '@/views/modules/news/list'
    import shouyangren from '@/views/modules/shouyangren/list'
    import quxiaoshenqinglingyang from '@/views/modules/quxiaoshenqinglingyang/list'
    import quxiaozhongshenshenqing from '@/views/modules/quxiaozhongshenshenqing/list'
    import shixinheimingdan from '@/views/modules/shixinheimingdan/list'
    import chongwuxiu from '@/views/modules/chongwuxiu/list'
    import shenqinglingyang from '@/views/modules/shenqinglingyang/list'
    import lingyangchenggong from '@/views/modules/lingyangchenggong/list'
    import dengzhongshenshenqing from '@/views/modules/dengzhongshenshenqing/list'
    import songyangren from '@/views/modules/songyangren/list'
    import users from '@/views/modules/users/list'
    import songyangchongwu from '@/views/modules/songyangchongwu/list'
    import quxiaodaichushenshenqing from '@/views/modules/quxiaodaichushenshenqing/list'
    import daichushenshenqing from '@/views/modules/daichushenshenqing/list'
    import diquleixing from '@/views/modules/diquleixing/list'
    import config from '@/views/modules/config/list'


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
	path: '/news',
        name: '宠物资讯',
        component: news
      }
          ,{
	path: '/shouyangren',
        name: '收养人',
        component: shouyangren
      }
          ,{
	path: '/quxiaoshenqinglingyang',
        name: '取消申请领养',
        component: quxiaoshenqinglingyang
      }
          ,{
	path: '/quxiaozhongshenshenqing',
        name: '取消终审申请',
        component: quxiaozhongshenshenqing
      }
          ,{
	path: '/shixinheimingdan',
        name: '失信黑名单',
        component: shixinheimingdan
      }
          ,{
	path: '/chongwuxiu',
        name: '宠物秀',
        component: chongwuxiu
      }
          ,{
	path: '/shenqinglingyang',
        name: '申请领养',
        component: shenqinglingyang
      }
          ,{
	path: '/lingyangchenggong',
        name: '领养成功',
        component: lingyangchenggong
      }
          ,{
	path: '/dengzhongshenshenqing',
        name: '等终审申请',
        component: dengzhongshenshenqing
      }
          ,{
	path: '/songyangren',
        name: '送养人',
        component: songyangren
      }
          ,{
	path: '/users',
        name: '管理员',
        component: users
      }
          ,{
	path: '/songyangchongwu',
        name: '送养宠物',
        component: songyangchongwu
      }
          ,{
	path: '/quxiaodaichushenshenqing',
        name: '取消待初审申请',
        component: quxiaodaichushenshenqing
      }
          ,{
	path: '/daichushenshenqing',
        name: '待初审申请',
        component: daichushenshenqing
      }
          ,{
	path: '/diquleixing',
        name: '地区类型',
        component: diquleixing
      }
          ,{
	path: '/config',
        name: '轮播图管理',
        component: config
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
