pipeline {
    agent any  // 运行在当前 Jenkins 节点（你的 Windows 服务器）

    environment {
        // 仅保留必要环境变量（根据你的实际路径修改）
        ANDROID_HOME = 'D:\\AndroidSDK'
        JAVA_HOME = 'D:\\soft\\AndroidStudioMeerKat\\AndroidStudio\\jbr'
    }

    stages {
        stage('拉取代码') {
            steps {
                // 替换为你的 CodeCommit 仓库 URL
                git url: 'https://git-codecommit.ap-northeast-1.amazonaws.com/v1/repos/CICD_Android_Test/',
                git url: 'https://git-codecommit.ap-northeast-1.amazonaws.com/v1/repos/CICD_Android_Test/',
                    branch: 'main',
                    credentialsId: 'b907147a-824f-46d7-bc2c-e44084b32cc5'  // 你的凭证 ID
            }
        }

        stage('基础环境检查') {
            steps {
                bat """
                    echo 验证 Java 环境...
                    "${env.JAVA_HOME}\\bin\\java" -version
                    
                    echo 验证 Android SDK 环境...
                    "${env.ANDROID_HOME}\\tools\\bin\\sdkmanager.bat" --version
                """
            }
        }

        stage('构建 Debug 包') {
            steps {
                // 使用项目内的 gradlew 脚本（无需单独配置 GRADLE_HOME）
                bat 'gradlew.bat assembleDebug'
            }
        }

        stage('归档 Debug 产物') {
            steps {
                archiveArtifacts artifacts: 'app\\build\\outputs\\apk\\debug\\*.apk', 
                                onlyIfSuccessful: true
            }
        }
    }

    post {
        success {
            echo '简单构建验证成功！Debug 包已归档'
        }
        failure {
            echo '构建失败，查看控制台日志'
        }
    }
}