# Git in IntelliJ IDEA: A Quick Guide

## 1. **Setting Up Git**
Before using Git in IntelliJ IDEA:
- Install Git from [git-scm.com](https://git-scm.com/).
- In IntelliJ IDEA, go to **File** > **Settings** (or **IntelliJ IDEA** > **Preferences** on macOS) > **Version Control** > **Git**.
- Set the path to the Git executable and click **Test** to verify.

## 2. **Cloning a Repository**
- Go to **File** > **New** > **Project from Version Control** > **Git**.
- Enter the repository URL and directory.
- Click **Clone** to import the project.

## 3. **Checking Git Status**
- Open the **Git** tool window: **View** > **Tool Windows** > **Git**.
- View the status of files (staged, modified, untracked).

## 4. **Adding and Committing Changes**
- Stage changes by right-clicking files in the **Local Changes** window and selecting **Add to VCS**.
- Commit changes: **Ctrl + K** (or **Cmd + K** on macOS). Write a commit message and click **Commit** or **Commit and Push**.

## 5. **Pushing Changes to Remote**
- After committing, push changes: **Ctrl + Shift + K** (or **Cmd + Shift + K** on macOS).
- Enter credentials (if prompted) to push changes to the remote repository.

## 6. **Pulling Changes**
- To pull changes from a remote repository: **VCS** > **Git** > **Pull**.

## 7. **Branching and Merging**
- Create a new branch by clicking on the branch name in the bottom-right corner, then selecting **New Branch**.
- Switch branches by selecting a branch from the Git tool window.
- Merge branches: **VCS** > **Git** > **Merge Changes**.

## 8. **Resolving Merge Conflicts**
- If a conflict occurs, IntelliJ will display a prompt. Use the built-in merge tool to resolve conflicts and apply changes.

## 9. **Viewing Git Logs**
- View commit history: **VCS** > **Git** > **Show History**. Filter, compare commits, or revert to previous commits.

## 10. **Reverting a Commit**
- Right-click a commit in the **Git Log** and select **Revert** to create a new commit that undoes the changes.

## 11. **Git Configuration**
- Configure Git user name and email: **File** > **Settings** > **Version Control** > **Git**.

## 12. **Tagging in Git**
- To create a tag: **VCS** > **Git** > **Tag**. Provide a tag name and click **OK**.

## 13. **Git Rebase**
- Rebase a branch: **VCS** > **Git** > **Rebase**. Select the branch to rebase onto and click **Rebase**.

## 14. **Managing Remotes**
- Manage remotes: **VCS** > **Git** > **Remotes**. Add, remove, or edit remotes.

## 15. **Git and Pull Requests**
- Create, view, and manage pull requests directly in IntelliJ for GitHub or GitLab users: **VCS** > **Git** > **GitHub** or **GitLab**.

## Tips & Tricks
- **Terminal Autocompletion**: IntelliJ supports autocompletion for Git commands in the terminal.
- **Local Changes View**: View and manage staged/unstaged files.
- **Git Log**: View the commit history in the **Log** tab at the bottom of IntelliJ.
