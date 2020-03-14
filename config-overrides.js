// 基于customize 和 react-app-rewired的定制化配置文件


// 引入相关的方法
const { 
    override,
    addLessLoader

} = require('customize-cra')

module.exports = override(
    addLessLoader({
        javascriptEnabled: true
    })
)