# Git Command Line Summary

## 1. **Setup and Configuration**

- **Set username and email**
    ```bash
    git config --global user.name "Your Name"
    git config --global user.email "your.email@example.com"
    ```

## 2. **Repository Initialization and Cloning**

- **Initialize a new Git repository**
    ```bash
    git init
    ```

- **Clone an existing repository**
    ```bash
    git clone https://github.com/username/repository.git
    ```

## 3. **Working with Files**

- **Check the status of the repository**
    ```bash
    git status
    ```

- **Add files to the staging area**
    ```bash
    git add .        # Add all modified and new files
    git add <file>   # Add a specific file
    ```

- **Commit changes**
    ```bash
    git commit -m "Your commit message"
    ```

- **View commit history**
    ```bash
    git log           # Show all commits
    git log --oneline # Show commits in a simplified format
    ```

## 4. **Working with Branches**

- **Create a new branch and switch to it**
    ```bash
    git checkout -b new-branch
    ```

- **Switch between branches**
    ```bash
    git checkout existing-branch
    ```

- **List all branches**
    ```bash
    git branch
    ```

- **Delete a local branch**
    ```bash
    git branch -d branch-name
    ```

## 5. **Syncing with Remote Repositories**

- **Push changes to a remote repository**
    ```bash
    git push origin branch-name
    ```

- **Pull changes from a remote repository**
    ```bash
    git pull origin branch-name
    ```

- **View remote repositories**
    ```bash
    git remote -v
    ```

- **Add a remote repository**
    ```bash
    git remote add origin https://github.com/username/repository.git
    ```

## 6. **Merging Changes**

- **Merge a branch into the current branch**
    ```bash
    git merge branch-name
    ```

- **Resolve merge conflicts**  
  After resolving the conflict manually, stage the resolved files:
    ```bash
    git add <file>
    ```

## 7. **Undoing Changes**

- **Undo changes in the working directory (before staging)**
    ```bash
    git checkout -- <file>
    ```

- **Unstage a file (remove from staging area)**
    ```bash
    git reset <file>
    ```

- **Undo the last commit (soft reset)**
    ```bash
    git reset --soft HEAD~1
    ```

- **Remove the last commit (hard reset)**
    ```bash
    git reset --hard HEAD~1
    ```

## 8. **Stashing Changes**

- **Stash changes (temporarily save changes)**
    ```bash
    git stash
    ```

- **Apply the last stashed changes**
    ```bash
    git stash apply
    ```

- **List all stashes**
    ```bash
    git stash list
    ```

## 9. **Tagging**

- **Create a tag**
    ```bash
    git tag v1.0.0
    ```

- **Push tags to the remote repository**
    ```bash
    git push origin --tags
    ```

## 10. **Cleaning Up**

- **Delete a remote branch**
    ```bash
    git push origin --delete branch-name
    ```

- **Remove untracked files**
    ```bash
    git clean -f
    ```

## 11. **Advanced Commands**

- **Rebase a branch (apply commits from one branch onto another)**
    ```bash
    git rebase branch-name
    ```

- **View the difference between staged and working directory**
    ```bash
    git diff
    ```

- **Show what’s staged for the next commit**
    ```bash
    git diff --cached
    ```

- **Revert a commit (create a new commit that undoes a previous commit)**
    ```bash
    git revert <commit-id>
    ```

## 12. **Help**

- **Get help for a specific command**
    ```bash
    git <command> --help
    ```

### Example Workflow

1. **Clone a repository**:
    ```bash
    git clone https://github.com/username/repository.git
    ```

2. **Create a new branch**:
    ```bash
    git checkout -b feature-branch
    ```

3. **Make changes, stage, and commit**:
    ```bash
    git add .
    git commit -m "Add new feature"
    ```

4. **Push the branch to the remote repository**:
    ```bash
    git push origin feature-branch
    ```

5. **Create a Pull Request (on GitHub)** for merging.

6. **Merge the branch after review**, and delete it:
    ```bash
    git branch -d feature-branch
    ```

---

This is a general summary of commonly used Git commands. For more advanced operations, check the official [Git Documentation](https://git-scm.com/doc).
