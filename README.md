# git-learning
### 如果是新项目，创建 git 仓库
```
mkdir SpringBootInAction
cd SpringBootInAction
git init
##将当前目录下的所有文件添加到git仓库
git add .
git commit -m "first commit"
##首先要建好一个远端仓库(URL),如https://xxx/SpringBootInAction.git
git remote add origin https://xxx/SpringBootInAction.git
git push -u -f origin master
```
### 如果是已有项目
```
cd existing_git_repo
git remote add origin https://xxx/SpringBootInAction.git
git push -u origin master
```
### Git版本回退
拷贝Revision Number
```
git reset --hard resetVersionHash
git reset --hard 4b91ea12de20cdf97eccb6bc9125bbc2fef79b17
```
最后，把当前分支强制提交到远程
```
git push -f origin currentBranch
git push -f origin master
```
