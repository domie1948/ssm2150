
var projectName = '宠物领养系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
]


var indexNav = [

{
	name: '送养宠物',
	url: './pages/songyangchongwu/list.html'
}, 
{
	name: '失信黑名单',
	url: './pages/shixinheimingdan/list.html'
}, 
{
	name: '宠物秀',
	url: './pages/chongwuxiu/list.html'
}, 

{
	name: '宠物资讯',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/ssmz6rfy/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"送养人","menuJump":"列表","tableName":"songyangren"}],"menu":"送养人管理"},{"child":[{"buttons":["查看","修改","删除","审核"],"menu":"送养宠物","menuJump":"列表","tableName":"songyangchongwu"}],"menu":"送养宠物管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"地区类型","menuJump":"列表","tableName":"diquleixing"}],"menu":"地区类型管理"},{"child":[{"buttons":["查看","删除","审核"],"menu":"失信黑名单","menuJump":"列表","tableName":"shixinheimingdan"}],"menu":"失信黑名单管理"},{"child":[{"buttons":["查看","删除","修改","新增"],"menu":"申请领养","menuJump":"列表","tableName":"shenqinglingyang"}],"menu":"申请领养管理"},{"child":[{"buttons":["查看","删除"],"menu":"宠物秀","menuJump":"列表","tableName":"chongwuxiu"}],"menu":"宠物秀管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"收养人","menuJump":"列表","tableName":"shouyangren"}],"menu":"收养人管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"待初审申请","menuJump":"列表","tableName":"daichushenshenqing"}],"menu":"待初审申请管理"},{"child":[{"buttons":["删除","修改","查看","审核","领养成功"],"menu":"等终审申请","menuJump":"列表","tableName":"dengzhongshenshenqing"}],"menu":"等终审申请管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"领养成功","menuJump":"列表","tableName":"lingyangchenggong"}],"menu":"领养成功管理"},{"child":[{"buttons":["删除","修改","查看"],"menu":"取消申请领养","menuJump":"列表","tableName":"quxiaoshenqinglingyang"}],"menu":"取消申请领养管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"取消待初审申请","menuJump":"列表","tableName":"quxiaodaichushenshenqing"}],"menu":"取消待初审申请管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"取消终审申请","menuJump":"列表","tableName":"quxiaozhongshenshenqing"}],"menu":"取消终审申请管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"管理员","tableName":"users"}],"menu":"管理员管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"宠物资讯","tableName":"news"},{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看","领养"],"menu":"送养宠物列表","menuJump":"列表","tableName":"songyangchongwu"}],"menu":"送养宠物模块"},{"child":[{"buttons":["查看"],"menu":"失信黑名单列表","menuJump":"列表","tableName":"shixinheimingdan"}],"menu":"失信黑名单模块"},{"child":[{"buttons":["查看"],"menu":"宠物秀列表","menuJump":"列表","tableName":"chongwuxiu"}],"menu":"宠物秀模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["删除","新增","查看","修改"],"menu":"送养宠物","menuJump":"列表","tableName":"songyangchongwu"}],"menu":"送养宠物管理"},{"child":[{"buttons":["查看","新增","删除","修改"],"menu":"失信黑名单","menuJump":"列表","tableName":"shixinheimingdan"}],"menu":"失信黑名单管理"},{"child":[{"buttons":["查看","修改","删除","审核","取消","待初审"],"menu":"申请领养","menuJump":"列表","tableName":"shenqinglingyang"}],"menu":"申请领养管理"},{"child":[{"buttons":["查看","修改","删除","取消"],"menu":"待初审申请","menuJump":"列表","tableName":"daichushenshenqing"}],"menu":"待初审申请管理"},{"child":[{"buttons":["查看","修改","删除","取消"],"menu":"等终审申请","menuJump":"列表","tableName":"dengzhongshenshenqing"}],"menu":"等终审申请管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"领养成功","menuJump":"列表","tableName":"lingyangchenggong"}],"menu":"领养成功管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"取消申请领养","menuJump":"列表","tableName":"quxiaoshenqinglingyang"}],"menu":"取消申请领养管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"取消待初审申请","menuJump":"列表","tableName":"quxiaodaichushenshenqing"}],"menu":"取消待初审申请管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"取消终审申请","menuJump":"列表","tableName":"quxiaozhongshenshenqing"}],"menu":"取消终审申请管理"}],"frontMenu":[{"child":[{"buttons":["查看","领养"],"menu":"送养宠物列表","menuJump":"列表","tableName":"songyangchongwu"}],"menu":"送养宠物模块"},{"child":[{"buttons":["查看"],"menu":"失信黑名单列表","menuJump":"列表","tableName":"shixinheimingdan"}],"menu":"失信黑名单模块"},{"child":[{"buttons":["查看"],"menu":"宠物秀列表","menuJump":"列表","tableName":"chongwuxiu"}],"menu":"宠物秀模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"送养人","tableName":"songyangren"},{"backMenu":[{"child":[{"buttons":["查看"],"menu":"申请领养","menuJump":"列表","tableName":"shenqinglingyang"}],"menu":"申请领养管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"宠物秀","menuJump":"列表","tableName":"chongwuxiu"}],"menu":"宠物秀管理"},{"child":[{"buttons":["查看","进入待终审"],"menu":"待初审申请","menuJump":"列表","tableName":"daichushenshenqing"}],"menu":"待初审申请管理"},{"child":[{"buttons":["查看"],"menu":"等终审申请","menuJump":"列表","tableName":"dengzhongshenshenqing"}],"menu":"等终审申请管理"},{"child":[{"buttons":["查看"],"menu":"领养成功","menuJump":"列表","tableName":"lingyangchenggong"}],"menu":"领养成功管理"},{"child":[{"buttons":["查看"],"menu":"取消申请领养","menuJump":"列表","tableName":"quxiaoshenqinglingyang"}],"menu":"取消申请领养管理"},{"child":[{"buttons":["查看"],"menu":"取消待初审申请","menuJump":"列表","tableName":"quxiaodaichushenshenqing"}],"menu":"取消待初审申请管理"},{"child":[{"buttons":["查看"],"menu":"取消终审申请","menuJump":"列表","tableName":"quxiaozhongshenshenqing"}],"menu":"取消终审申请管理"}],"frontMenu":[{"child":[{"buttons":["查看","领养"],"menu":"送养宠物列表","menuJump":"列表","tableName":"songyangchongwu"}],"menu":"送养宠物模块"},{"child":[{"buttons":["查看"],"menu":"失信黑名单列表","menuJump":"列表","tableName":"shixinheimingdan"}],"menu":"失信黑名单模块"},{"child":[{"buttons":["查看"],"menu":"宠物秀列表","menuJump":"列表","tableName":"chongwuxiu"}],"menu":"宠物秀模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"收养人","tableName":"shouyangren"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
