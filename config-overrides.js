// 基于customize 和 react-app-rewired的定制化配置文件


// 引入相关的方法
const { 
    override,
    addLessLoader,
    fixBabelImports,
    addDecoratorsLegacy

} = require('customize-cra')


const modifyVars = require('./lessVars')

module.exports = override(
    addLessLoader({
        javascriptEnabled: true,
        modifyVars
    }),
    fixBabelImports('import', {
        libraryName: 'antd',
        librayrDirectory: 'es',
        style: true
    }),
    addDecoratorsLegacy()   
)