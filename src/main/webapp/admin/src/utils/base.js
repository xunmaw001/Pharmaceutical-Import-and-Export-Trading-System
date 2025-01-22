const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm7049m/",
            name: "ssm7049m",
            // 退出到首页链接
            indexUrl: ''
        };
    },
    getProjectName(){
        return {
            projectName: "医药进出口交易系统"
        } 
    }
}
export default base
