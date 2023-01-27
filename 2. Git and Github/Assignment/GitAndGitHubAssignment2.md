# Assignment (Git and GitHub Part II)

### **1. How to check if git is available on your system ?**

#### We can check by executing git --version command, if it is present it is expected to give us the version and if not it terminal won't identify git command.

<br/>

### **2. How to initialize a new git repository?**

#### To initialize a new git repository we have to execute the command : git init

<br/>

### **3. How to tell git about your name and email?**

#### To set name and email in git we have to use below commands respectively

#### i) git config user.name "YOUR_NAME"

#### ii) git config user.email "YOUR_EMAIL"

<br/>

### **4. How to add file to staging area ?.**

#### File can be added in stagging area by using command : git add "filename"

<br/>

### **5. How to remove file from staging area?**

#### File can be removed from staging area by using command : git rm "filename" --cached

<br/>

### **6. How to make a commit?**

#### To make a commit we have to first add the file in the staging area and then we can commit it, we have to use below command

#### 1. add file in staging area by using : git add "filename".

#### 2. commit the changes : git commit -m "commit message"

 <br/>

### **7. How to send your changes to remote repository?**

#### To send our changes to the remote repository we have to perform following steps.

#### 1. Add the remote to local repository by using : git add remote "remote name" "url".

#### 2. Send changes using : git push

<br/>

### **5. What is difference between clone and pull ?**

#### git clone is used to get a local copy of an existing repository to work on.

#### git pull (or git fetch + git merge ) is used to update that local copy with new commits from the remote repository.
